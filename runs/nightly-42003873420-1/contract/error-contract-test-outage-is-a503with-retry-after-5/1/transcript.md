# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 63 | `qa-5e16d6c4-62e1-48d3-b673-d8dec22db296` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-aaef689d-b631-415c-bb44-8c378da7b1de` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-f6c49683-fbae-4f51-9998-da0bac4b5d41` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-cc8d9537-0bbb-4c84-bf09-3d6575292cdc` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 17 | `qa-fa460e27-9af1-408e-bd90-c886f247ce88` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-3880aff5-e669-4e56-9fed-3a7064f353aa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-ef1336e8-99e1-430c-ae2f-ff1c8b1df841` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-c7b82dc4-8571-43d5-859f-4fc6434c972f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-9ae1b921-b776-4e05-ae8e-e5daf4946138` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-91af1d12-57c0-456d-85c7-bce2b5e6c539` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e16d6c4-62e1-48d3-b673-d8dec22db296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e16d6c4-62e1-48d3-b673-d8dec22db296
Content-Type: application/json

--- request body ---
{"handle":"qa-562aef0859b7","displayName":"QA 562aef0859b7","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e16d6c4-62e1-48d3-b673-d8dec22db296
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-562aef0859b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2014516-bb8e-4c20-b64a-4e804f6df7e3","handle":"qa-562aef0859b7","displayName":"QA 562aef0859b7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.500700605Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-aaef689d-b631-415c-bb44-8c378da7b1de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaef689d-b631-415c-bb44-8c378da7b1de
Content-Type: application/json

--- request body ---
{"handle":"qa-a10f3ea5bcc5","displayName":"QA a10f3ea5bcc5","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaef689d-b631-415c-bb44-8c378da7b1de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 7
Location: /v1/accounts/qa-a10f3ea5bcc5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_15651783-44d2-4f44-a6e4-1f8fcf270fc9","handle":"qa-a10f3ea5bcc5","displayName":"QA a10f3ea5bcc5","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.607781714Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f6c49683-fbae-4f51-9998-da0bac4b5d41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6c49683-fbae-4f51-9998-da0bac4b5d41
Content-Type: application/json

--- request body ---
{"handle":"qa-562aef0859b7","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6c49683-fbae-4f51-9998-da0bac4b5d41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2014516-bb8e-4c20-b64a-4e804f6df7e3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cc8d9537-0bbb-4c84-bf09-3d6575292cdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc8d9537-0bbb-4c84-bf09-3d6575292cdc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a10f3ea5bcc5","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc8d9537-0bbb-4c84-bf09-3d6575292cdc
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
Location: /v1/conversations/cnv_dc5c5fd6-3116-4342-ac28-0103184efb38
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dc5c5fd6-3116-4342-ac28-0103184efb38","subject":"Error contract","status":"open","region":"eu","participants":["qa-562aef0859b7","qa-a10f3ea5bcc5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.697735823Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-562aef0859b7
correlation: qa-fa460e27-9af1-408e-bd90-c886f247ce88

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: cc70b947-284f-4d56-a181-555c75fe6af4
X-Correlation-Id: qa-fa460e27-9af1-408e-bd90-c886f247ce88
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa460e27-9af1-408e-bd90-c886f247ce88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-562aef0859b7","correlationId":"qa-fa460e27-9af1-408e-bd90-c886f247ce88"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3880aff5-e669-4e56-9fed-3a7064f353aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3880aff5-e669-4e56-9fed-3a7064f353aa
Content-Type: application/json

--- request body ---
{"handle":"qa-a10f3ea5bcc5","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-3880aff5-e669-4e56-9fed-3a7064f353aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_15651783-44d2-4f44-a6e4-1f8fcf270fc9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef1336e8-99e1-430c-ae2f-ff1c8b1df841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef1336e8-99e1-430c-ae2f-ff1c8b1df841
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef1336e8-99e1-430c-ae2f-ff1c8b1df841
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
correlation: qa-c7b82dc4-8571-43d5-859f-4fc6434c972f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7b82dc4-8571-43d5-859f-4fc6434c972f
Content-Type: application/json

--- request body ---
{"handle":"qa-a10f3ea5bcc5","password":"****"}

--- response: 401 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7b82dc4-8571-43d5-859f-4fc6434c972f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7b82dc4-8571-43d5-859f-4fc6434c972f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ae1b921-b776-4e05-ae8e-e5daf4946138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ae1b921-b776-4e05-ae8e-e5daf4946138
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ae1b921-b776-4e05-ae8e-e5daf4946138
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-91af1d12-57c0-456d-85c7-bce2b5e6c539

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91af1d12-57c0-456d-85c7-bce2b5e6c539
Content-Type: application/json

--- request body ---
{"handle":"qa-562aef0859b7","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91af1d12-57c0-456d-85c7-bce2b5e6c539
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91af1d12-57c0-456d-85c7-bce2b5e6c539"}
```
