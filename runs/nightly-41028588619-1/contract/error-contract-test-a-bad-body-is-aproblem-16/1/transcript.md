# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-78848fa1-a47b-4ca2-9224-ffd920a1b199` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-077e2d61-3941-4cc6-8fa3-9d2b25e7a451` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-37ce0eff-9ffe-46dd-9a6e-0fbc212413fb` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-14f28767-4a02-49e1-bf83-f0ab67a290cd` |
| 5 | `POST /v1/credits/purchases` | 415 | 10 | `qa-f6e441de-9af0-4fbf-b150-f00c54d424af` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-9f21612d-c435-456d-9250-e786fc1c0135` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-bbc5e6eb-3678-4b65-909d-2f49ced070b7` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-08096274-c80e-47f3-b14e-5db6f0fc2083` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-3a3944a2-4259-41b3-a11e-7af16df97d51` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-51b24da5-c466-405c-a747-d1af92b3fcdf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-78848fa1-a47b-4ca2-9224-ffd920a1b199

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78848fa1-a47b-4ca2-9224-ffd920a1b199
Content-Type: application/json

--- request body ---
{"handle":"qa-204ba9246053","displayName":"QA 204ba9246053","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-78848fa1-a47b-4ca2-9224-ffd920a1b199
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Location: /v1/accounts/qa-204ba9246053
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99586412-4824-4f5e-b7ed-87c737077018","handle":"qa-204ba9246053","displayName":"QA 204ba9246053","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.660504133Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-077e2d61-3941-4cc6-8fa3-9d2b25e7a451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-077e2d61-3941-4cc6-8fa3-9d2b25e7a451
Content-Type: application/json

--- request body ---
{"handle":"qa-2570cf70a65b","displayName":"QA 2570cf70a65b","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-077e2d61-3941-4cc6-8fa3-9d2b25e7a451
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Location: /v1/accounts/qa-2570cf70a65b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_93d6c170-cd04-4a9a-8f78-a1f14518c382","handle":"qa-2570cf70a65b","displayName":"QA 2570cf70a65b","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.699313841Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-37ce0eff-9ffe-46dd-9a6e-0fbc212413fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37ce0eff-9ffe-46dd-9a6e-0fbc212413fb
Content-Type: application/json

--- request body ---
{"handle":"qa-204ba9246053","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-37ce0eff-9ffe-46dd-9a6e-0fbc212413fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99586412-4824-4f5e-b7ed-87c737077018"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-14f28767-4a02-49e1-bf83-f0ab67a290cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14f28767-4a02-49e1-bf83-f0ab67a290cd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2570cf70a65b","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-14f28767-4a02-49e1-bf83-f0ab67a290cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_155ffc44-e4f2-4c91-86da-2f7ba15c746f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_155ffc44-e4f2-4c91-86da-2f7ba15c746f","subject":"Error contract","status":"open","region":"eu","participants":["qa-204ba9246053","qa-2570cf70a65b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.762201951Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f6e441de-9af0-4fbf-b150-f00c54d424af

--- request headers ---
Accept: application/json
Idempotency-Key: qa-86c4a86754464e34be43b2b224ac9603
X-Correlation-Id: qa-f6e441de-9af0-4fbf-b150-f00c54d424af
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6e441de-9af0-4fbf-b150-f00c54d424af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-f6e441de-9af0-4fbf-b150-f00c54d424af"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9f21612d-c435-456d-9250-e786fc1c0135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f21612d-c435-456d-9250-e786fc1c0135
Content-Type: application/json

--- request body ---
{"handle":"qa-2570cf70a65b","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f21612d-c435-456d-9250-e786fc1c0135
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93d6c170-cd04-4a9a-8f78-a1f14518c382"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bbc5e6eb-3678-4b65-909d-2f49ced070b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbc5e6eb-3678-4b65-909d-2f49ced070b7
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bbc5e6eb-3678-4b65-909d-2f49ced070b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-08096274-c80e-47f3-b14e-5db6f0fc2083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08096274-c80e-47f3-b14e-5db6f0fc2083
Content-Type: application/json

--- request body ---
{"handle":"qa-2570cf70a65b","password":"****"}

--- response: 401 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08096274-c80e-47f3-b14e-5db6f0fc2083
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08096274-c80e-47f3-b14e-5db6f0fc2083"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a3944a2-4259-41b3-a11e-7af16df97d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a3944a2-4259-41b3-a11e-7af16df97d51
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a3944a2-4259-41b3-a11e-7af16df97d51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-51b24da5-c466-405c-a747-d1af92b3fcdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51b24da5-c466-405c-a747-d1af92b3fcdf
Content-Type: application/json

--- request body ---
{"handle":"qa-204ba9246053","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51b24da5-c466-405c-a747-d1af92b3fcdf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51b24da5-c466-405c-a747-d1af92b3fcdf"}
```
