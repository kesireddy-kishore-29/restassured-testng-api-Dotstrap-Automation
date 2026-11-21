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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-712b5c34-da7b-4f42-8785-fd31d67be98c` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-4e97afcd-882c-4e2e-a4fc-112075a774d6` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-f00bf089-ffd1-4e5e-b5d7-69fef077cfbb` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-cf07178a-26df-4a58-bbf3-cddfbcb8c863` |
| 5 | `GET /v1/accounts/me` | 503 | 20 | `qa-98d72239-b5f7-42d3-bbba-81d0a29191db` |
| 6 | `POST /v1/auth/token` | 200 | 59 | `qa-387bf0c7-b60c-4b7c-871b-02aa50c2df6d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-8f2d4e4c-455b-44d2-be7a-b52a897d6cf0` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-74de2887-2ca0-4065-b87d-1b21da1ef12d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-6c540401-247f-4c7a-b7cf-db710659a680` |
| 10 | `POST /v1/auth/token` | 401 | 51 | `qa-ee32d4d2-d9b3-4cad-ab0e-834687781d27` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-712b5c34-da7b-4f42-8785-fd31d67be98c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-712b5c34-da7b-4f42-8785-fd31d67be98c
Content-Type: application/json

--- request body ---
{"handle":"qa-92be5482dd18","displayName":"QA 92be5482dd18","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-712b5c34-da7b-4f42-8785-fd31d67be98c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-92be5482dd18
X-Served-Region: eu
Content-Length: 181

{"id":"acc_770d9806-7e64-4858-bcc0-58a9db73e3cc","handle":"qa-92be5482dd18","displayName":"QA 92be5482dd18","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.598914008Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4e97afcd-882c-4e2e-a4fc-112075a774d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e97afcd-882c-4e2e-a4fc-112075a774d6
Content-Type: application/json

--- request body ---
{"handle":"qa-bb7881b940f6","displayName":"QA bb7881b940f6","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e97afcd-882c-4e2e-a4fc-112075a774d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-bb7881b940f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a2fea4b-e785-424b-be7c-284b951d0e36","handle":"qa-bb7881b940f6","displayName":"QA bb7881b940f6","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.634089640Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f00bf089-ffd1-4e5e-b5d7-69fef077cfbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f00bf089-ffd1-4e5e-b5d7-69fef077cfbb
Content-Type: application/json

--- request body ---
{"handle":"qa-92be5482dd18","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f00bf089-ffd1-4e5e-b5d7-69fef077cfbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_770d9806-7e64-4858-bcc0-58a9db73e3cc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cf07178a-26df-4a58-bbf3-cddfbcb8c863

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf07178a-26df-4a58-bbf3-cddfbcb8c863
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bb7881b940f6","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf07178a-26df-4a58-bbf3-cddfbcb8c863
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
Location: /v1/conversations/cnv_6ce0dc1d-9d2d-4d75-9cd2-875c0fe415e6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6ce0dc1d-9d2d-4d75-9cd2-875c0fe415e6","subject":"Error contract","status":"open","region":"eu","participants":["qa-92be5482dd18","qa-bb7881b940f6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.746700882Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-98d72239-b5f7-42d3-bbba-81d0a29191db

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4a23d83d-b304-4d2a-ad70-1aeb6131443f
X-Correlation-Id: qa-98d72239-b5f7-42d3-bbba-81d0a29191db
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98d72239-b5f7-42d3-bbba-81d0a29191db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-98d72239-b5f7-42d3-bbba-81d0a29191db"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-387bf0c7-b60c-4b7c-871b-02aa50c2df6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-387bf0c7-b60c-4b7c-871b-02aa50c2df6d
Content-Type: application/json

--- request body ---
{"handle":"qa-bb7881b940f6","password":"****"}

--- response: 200 in 59 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-387bf0c7-b60c-4b7c-871b-02aa50c2df6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a2fea4b-e785-424b-be7c-284b951d0e36"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f2d4e4c-455b-44d2-be7a-b52a897d6cf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2d4e4c-455b-44d2-be7a-b52a897d6cf0
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f2d4e4c-455b-44d2-be7a-b52a897d6cf0
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
correlation: qa-74de2887-2ca0-4065-b87d-1b21da1ef12d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74de2887-2ca0-4065-b87d-1b21da1ef12d
Content-Type: application/json

--- request body ---
{"handle":"qa-bb7881b940f6","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74de2887-2ca0-4065-b87d-1b21da1ef12d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74de2887-2ca0-4065-b87d-1b21da1ef12d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c540401-247f-4c7a-b7cf-db710659a680

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c540401-247f-4c7a-b7cf-db710659a680
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c540401-247f-4c7a-b7cf-db710659a680
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ee32d4d2-d9b3-4cad-ab0e-834687781d27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee32d4d2-d9b3-4cad-ab0e-834687781d27
Content-Type: application/json

--- request body ---
{"handle":"qa-92be5482dd18","password":"****"}

--- response: 401 in 51 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee32d4d2-d9b3-4cad-ab0e-834687781d27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee32d4d2-d9b3-4cad-ab0e-834687781d27"}
```
