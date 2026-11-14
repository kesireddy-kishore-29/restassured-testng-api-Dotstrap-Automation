# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-58a5a01f-29cc-40ec-a911-e2df7b9cc557` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-3c667180-7cb0-436f-b696-245702109c41` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-5467c09c-d44c-4997-91eb-852fa537bd66` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-fd9cce8c-38b9-48ae-bc2f-f6121fab903c` |
| 5 | `GET /v1/accounts/me` | 503 | 33 | `qa-b7ba78b1-fb41-478d-8500-39d3efd78661` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-fef23061-7e2a-4d34-877d-7056c019dad2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-8b35fa08-018b-430e-9777-f1161a9366c0` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-9d71d9d4-5965-439a-866e-d54124de528b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-d9953e47-417d-4daf-80f4-e73e53eb756c` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-74e1d9e3-ba21-4263-9721-44bb09b386f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-58a5a01f-29cc-40ec-a911-e2df7b9cc557

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58a5a01f-29cc-40ec-a911-e2df7b9cc557
Content-Type: application/json

--- request body ---
{"handle":"qa-9db43a4987db","displayName":"QA 9db43a4987db","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-58a5a01f-29cc-40ec-a911-e2df7b9cc557
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-9db43a4987db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d0f8bec-f115-489b-bee8-f9aea6369c79","handle":"qa-9db43a4987db","displayName":"QA 9db43a4987db","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.870210736Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3c667180-7cb0-436f-b696-245702109c41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c667180-7cb0-436f-b696-245702109c41
Content-Type: application/json

--- request body ---
{"handle":"qa-a6c17246c47e","displayName":"QA a6c17246c47e","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c667180-7cb0-436f-b696-245702109c41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-a6c17246c47e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fe55da5b-8458-4b3d-beea-f8b1a7dbc2b8","handle":"qa-a6c17246c47e","displayName":"QA a6c17246c47e","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.894829668Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5467c09c-d44c-4997-91eb-852fa537bd66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5467c09c-d44c-4997-91eb-852fa537bd66
Content-Type: application/json

--- request body ---
{"handle":"qa-9db43a4987db","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5467c09c-d44c-4997-91eb-852fa537bd66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d0f8bec-f115-489b-bee8-f9aea6369c79"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fd9cce8c-38b9-48ae-bc2f-f6121fab903c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd9cce8c-38b9-48ae-bc2f-f6121fab903c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a6c17246c47e","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd9cce8c-38b9-48ae-bc2f-f6121fab903c
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
Location: /v1/conversations/cnv_d4861147-5299-4262-bf40-0833d881bb8b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d4861147-5299-4262-bf40-0833d881bb8b","subject":"Error contract","status":"open","region":"eu","participants":["qa-9db43a4987db","qa-a6c17246c47e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.963970872Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7ba78b1-fb41-478d-8500-39d3efd78661

--- request headers ---
Accept: application/json
X-Fault-Key: 4012a0bf-36dd-42b9-8c60-6dbce76c5a87
X-Fault: unavailable-once
X-Correlation-Id: qa-b7ba78b1-fb41-478d-8500-39d3efd78661
Content-Type: application/json

--- response: 503 in 33 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7ba78b1-fb41-478d-8500-39d3efd78661
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b7ba78b1-fb41-478d-8500-39d3efd78661"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fef23061-7e2a-4d34-877d-7056c019dad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fef23061-7e2a-4d34-877d-7056c019dad2
Content-Type: application/json

--- request body ---
{"handle":"qa-a6c17246c47e","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fef23061-7e2a-4d34-877d-7056c019dad2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe55da5b-8458-4b3d-beea-f8b1a7dbc2b8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b35fa08-018b-430e-9777-f1161a9366c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b35fa08-018b-430e-9777-f1161a9366c0
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b35fa08-018b-430e-9777-f1161a9366c0
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
correlation: qa-9d71d9d4-5965-439a-866e-d54124de528b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d71d9d4-5965-439a-866e-d54124de528b
Content-Type: application/json

--- request body ---
{"handle":"qa-a6c17246c47e","password":"****"}

--- response: 401 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d71d9d4-5965-439a-866e-d54124de528b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d71d9d4-5965-439a-866e-d54124de528b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d9953e47-417d-4daf-80f4-e73e53eb756c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9953e47-417d-4daf-80f4-e73e53eb756c
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d9953e47-417d-4daf-80f4-e73e53eb756c
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
correlation: qa-74e1d9e3-ba21-4263-9721-44bb09b386f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74e1d9e3-ba21-4263-9721-44bb09b386f2
Content-Type: application/json

--- request body ---
{"handle":"qa-9db43a4987db","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74e1d9e3-ba21-4263-9721-44bb09b386f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74e1d9e3-ba21-4263-9721-44bb09b386f2"}
```
