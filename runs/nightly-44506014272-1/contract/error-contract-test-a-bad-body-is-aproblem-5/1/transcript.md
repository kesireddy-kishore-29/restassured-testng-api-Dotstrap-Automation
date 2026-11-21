# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-57c35dff-75d2-4d89-ae35-3af4c907e07d` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-a9e53a84-6842-44a5-ac37-ef4e4faa7a42` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-e8840a89-6786-4ed5-aca1-d25bb8377c72` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-21f15a6a-fc9e-4ead-a3e6-0a98542df3f4` |
| 5 | `POST /v1/accounts` | 422 | 17 | `qa-a6abc231-bf76-418d-a2ba-6ada1bc2da8c` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-c1e150ad-2942-4b5b-8ca1-89843c0e5403` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-81351228-6a1e-4f9a-83fa-7a050c16b63a` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-e9a2fd7b-5b12-4980-8e04-89c23f260592` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-f78e99fb-c8cf-4230-af79-ecf8d035b3b4` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-7b72cc94-f4c3-4a94-b81d-941c4e5946d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-57c35dff-75d2-4d89-ae35-3af4c907e07d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57c35dff-75d2-4d89-ae35-3af4c907e07d
Content-Type: application/json

--- request body ---
{"handle":"qa-ba06d9d30b32","displayName":"QA ba06d9d30b32","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-57c35dff-75d2-4d89-ae35-3af4c907e07d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 7
Location: /v1/accounts/qa-ba06d9d30b32
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d28fa848-107b-4b74-b1f3-2c60c657a38a","handle":"qa-ba06d9d30b32","displayName":"QA ba06d9d30b32","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.344170010Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a9e53a84-6842-44a5-ac37-ef4e4faa7a42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9e53a84-6842-44a5-ac37-ef4e4faa7a42
Content-Type: application/json

--- request body ---
{"handle":"qa-0e6fa68b36ab","displayName":"QA 0e6fa68b36ab","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9e53a84-6842-44a5-ac37-ef4e4faa7a42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 7
Location: /v1/accounts/qa-0e6fa68b36ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e6b51ff-8146-4400-8689-a8e5c585e0a5","handle":"qa-0e6fa68b36ab","displayName":"QA 0e6fa68b36ab","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.439882677Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e8840a89-6786-4ed5-aca1-d25bb8377c72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8840a89-6786-4ed5-aca1-d25bb8377c72
Content-Type: application/json

--- request body ---
{"handle":"qa-ba06d9d30b32","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8840a89-6786-4ed5-aca1-d25bb8377c72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d28fa848-107b-4b74-b1f3-2c60c657a38a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-21f15a6a-fc9e-4ead-a3e6-0a98542df3f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21f15a6a-fc9e-4ead-a3e6-0a98542df3f4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0e6fa68b36ab","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-21f15a6a-fc9e-4ead-a3e6-0a98542df3f4
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
Location: /v1/conversations/cnv_b92f96d6-6dde-4c76-b4f3-a7b37bba4c60
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b92f96d6-6dde-4c76-b4f3-a7b37bba4c60","subject":"Error contract","status":"open","region":"eu","participants":["qa-ba06d9d30b32","qa-0e6fa68b36ab"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.572251357Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-a6abc231-bf76-418d-a2ba-6ada1bc2da8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6abc231-bf76-418d-a2ba-6ada1bc2da8c
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6abc231-bf76-418d-a2ba-6ada1bc2da8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-a6abc231-bf76-418d-a2ba-6ada1bc2da8c","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c1e150ad-2942-4b5b-8ca1-89843c0e5403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1e150ad-2942-4b5b-8ca1-89843c0e5403
Content-Type: application/json

--- request body ---
{"handle":"qa-0e6fa68b36ab","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1e150ad-2942-4b5b-8ca1-89843c0e5403
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e6b51ff-8146-4400-8689-a8e5c585e0a5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81351228-6a1e-4f9a-83fa-7a050c16b63a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81351228-6a1e-4f9a-83fa-7a050c16b63a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81351228-6a1e-4f9a-83fa-7a050c16b63a
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
correlation: qa-e9a2fd7b-5b12-4980-8e04-89c23f260592

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9a2fd7b-5b12-4980-8e04-89c23f260592
Content-Type: application/json

--- request body ---
{"handle":"qa-0e6fa68b36ab","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9a2fd7b-5b12-4980-8e04-89c23f260592
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e9a2fd7b-5b12-4980-8e04-89c23f260592"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f78e99fb-c8cf-4230-af79-ecf8d035b3b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f78e99fb-c8cf-4230-af79-ecf8d035b3b4
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f78e99fb-c8cf-4230-af79-ecf8d035b3b4
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
correlation: qa-7b72cc94-f4c3-4a94-b81d-941c4e5946d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b72cc94-f4c3-4a94-b81d-941c4e5946d6
Content-Type: application/json

--- request body ---
{"handle":"qa-ba06d9d30b32","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b72cc94-f4c3-4a94-b81d-941c4e5946d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b72cc94-f4c3-4a94-b81d-941c4e5946d6"}
```
