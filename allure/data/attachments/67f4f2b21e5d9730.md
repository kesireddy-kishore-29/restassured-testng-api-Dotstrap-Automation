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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-4f74839e-e951-4e91-914e-c7f08efba89f` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-01b5ff97-909d-469b-bdd1-80f5787c7b02` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-1f1827cf-5b99-4ece-b4ea-eb0e88b24821` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-e1041634-a8d4-448a-957b-be97e5fe13ec` |
| 5 | `GET /v1/accounts/me` | 503 | 21 | `qa-98405636-92ab-47a1-adde-54f6f1c4c926` |
| 6 | `POST /v1/auth/token` | 200 | 94 | `qa-7b1bee26-e30c-4953-b72e-42696cea4dfb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-a2b75055-16f9-47fc-8b45-53502c144ad9` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-09dba6a6-c615-4ac9-8420-04c8b40e8f2e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-a8c58cf8-b80c-41c1-853b-0c35c3344167` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-3bf315ca-d9c0-4dac-986a-1a825f75527c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4f74839e-e951-4e91-914e-c7f08efba89f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f74839e-e951-4e91-914e-c7f08efba89f
Content-Type: application/json

--- request body ---
{"handle":"qa-515468bda319","displayName":"QA 515468bda319","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f74839e-e951-4e91-914e-c7f08efba89f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-515468bda319
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1fcb3344-3be7-4f1b-b914-d803b0e6ce8a","handle":"qa-515468bda319","displayName":"QA 515468bda319","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.970220952Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-01b5ff97-909d-469b-bdd1-80f5787c7b02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01b5ff97-909d-469b-bdd1-80f5787c7b02
Content-Type: application/json

--- request body ---
{"handle":"qa-7cbd62ec5a4d","displayName":"QA 7cbd62ec5a4d","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-01b5ff97-909d-469b-bdd1-80f5787c7b02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-7cbd62ec5a4d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25243c5b-8eec-4843-a1a1-f9b5cb5868a4","handle":"qa-7cbd62ec5a4d","displayName":"QA 7cbd62ec5a4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.017911834Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1f1827cf-5b99-4ece-b4ea-eb0e88b24821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f1827cf-5b99-4ece-b4ea-eb0e88b24821
Content-Type: application/json

--- request body ---
{"handle":"qa-515468bda319","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f1827cf-5b99-4ece-b4ea-eb0e88b24821
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1fcb3344-3be7-4f1b-b914-d803b0e6ce8a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e1041634-a8d4-448a-957b-be97e5fe13ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1041634-a8d4-448a-957b-be97e5fe13ec
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7cbd62ec5a4d","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1041634-a8d4-448a-957b-be97e5fe13ec
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
Location: /v1/conversations/cnv_3c5ae3b7-f162-4d9b-b222-ea083f1c1cf1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3c5ae3b7-f162-4d9b-b222-ea083f1c1cf1","subject":"Error contract","status":"open","region":"eu","participants":["qa-515468bda319","qa-7cbd62ec5a4d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.136861620Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-98405636-92ab-47a1-adde-54f6f1c4c926

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 02ec47de-994b-435c-b335-ae84073f3282
X-Correlation-Id: qa-98405636-92ab-47a1-adde-54f6f1c4c926
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98405636-92ab-47a1-adde-54f6f1c4c926
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-98405636-92ab-47a1-adde-54f6f1c4c926"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7b1bee26-e30c-4953-b72e-42696cea4dfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b1bee26-e30c-4953-b72e-42696cea4dfb
Content-Type: application/json

--- request body ---
{"handle":"qa-7cbd62ec5a4d","password":"****"}

--- response: 200 in 94 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b1bee26-e30c-4953-b72e-42696cea4dfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25243c5b-8eec-4843-a1a1-f9b5cb5868a4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2b75055-16f9-47fc-8b45-53502c144ad9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2b75055-16f9-47fc-8b45-53502c144ad9
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2b75055-16f9-47fc-8b45-53502c144ad9
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
correlation: qa-09dba6a6-c615-4ac9-8420-04c8b40e8f2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09dba6a6-c615-4ac9-8420-04c8b40e8f2e
Content-Type: application/json

--- request body ---
{"handle":"qa-7cbd62ec5a4d","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09dba6a6-c615-4ac9-8420-04c8b40e8f2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09dba6a6-c615-4ac9-8420-04c8b40e8f2e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a8c58cf8-b80c-41c1-853b-0c35c3344167

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8c58cf8-b80c-41c1-853b-0c35c3344167
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a8c58cf8-b80c-41c1-853b-0c35c3344167
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
correlation: qa-3bf315ca-d9c0-4dac-986a-1a825f75527c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bf315ca-d9c0-4dac-986a-1a825f75527c
Content-Type: application/json

--- request body ---
{"handle":"qa-515468bda319","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bf315ca-d9c0-4dac-986a-1a825f75527c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3bf315ca-d9c0-4dac-986a-1a825f75527c"}
```
