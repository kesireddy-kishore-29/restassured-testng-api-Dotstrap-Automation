# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-adad6086-da20-4d95-a99b-61681dd4ffff` |
| 2 | `POST /v1/accounts` | 201 | 7 | `qa-e9fca244-ff0f-4d7b-a67d-2ccae663b42a` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-26ce9e0d-8d2d-4c96-b8eb-3f5b2b5d01c9` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-4a079fbe-fee9-48a7-9152-bdcf4623190d` |
| 5 | `POST /v1/credits/purchases` | 422 | 12 | `qa-df72d55b-b3c1-460f-8396-c43a089b4dde` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-30012fbf-8677-4369-b2f8-111de04febce` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-e297ccf7-d828-4a39-9474-fb3d8eeeb750` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-de25fd0e-a8be-421b-8a31-36d11cadbe21` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-837a23c3-5d99-44ac-9482-e27cb4167683` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-98089c72-827c-451e-a654-c736e2140726` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-adad6086-da20-4d95-a99b-61681dd4ffff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adad6086-da20-4d95-a99b-61681dd4ffff
Content-Type: application/json

--- request body ---
{"handle":"qa-26d4bfb23c58","displayName":"QA 26d4bfb23c58","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-adad6086-da20-4d95-a99b-61681dd4ffff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 8
Location: /v1/accounts/qa-26d4bfb23c58
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c76ba38-27f3-4001-998b-29ecc94541b3","handle":"qa-26d4bfb23c58","displayName":"QA 26d4bfb23c58","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.354946781Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e9fca244-ff0f-4d7b-a67d-2ccae663b42a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9fca244-ff0f-4d7b-a67d-2ccae663b42a
Content-Type: application/json

--- request body ---
{"handle":"qa-ab8900b84ee5","displayName":"QA ab8900b84ee5","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9fca244-ff0f-4d7b-a67d-2ccae663b42a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 8
Location: /v1/accounts/qa-ab8900b84ee5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_71ac5399-2b6c-4d3b-96eb-69f917f7a226","handle":"qa-ab8900b84ee5","displayName":"QA ab8900b84ee5","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.370640601Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-26ce9e0d-8d2d-4c96-b8eb-3f5b2b5d01c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26ce9e0d-8d2d-4c96-b8eb-3f5b2b5d01c9
Content-Type: application/json

--- request body ---
{"handle":"qa-26d4bfb23c58","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-26ce9e0d-8d2d-4c96-b8eb-3f5b2b5d01c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c76ba38-27f3-4001-998b-29ecc94541b3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4a079fbe-fee9-48a7-9152-bdcf4623190d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a079fbe-fee9-48a7-9152-bdcf4623190d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ab8900b84ee5","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a079fbe-fee9-48a7-9152-bdcf4623190d
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
Location: /v1/conversations/cnv_a41f48c1-f768-41e1-a786-562c94ac1ff7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a41f48c1-f768-41e1-a786-562c94ac1ff7","subject":"Error contract","status":"open","region":"eu","participants":["qa-26d4bfb23c58","qa-ab8900b84ee5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.418034298Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-df72d55b-b3c1-460f-8396-c43a089b4dde

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1a277cf5a47f466c9583a6cf8e8edf23
X-Correlation-Id: qa-df72d55b-b3c1-460f-8396-c43a089b4dde
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df72d55b-b3c1-460f-8396-c43a089b4dde
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-df72d55b-b3c1-460f-8396-c43a089b4dde","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-30012fbf-8677-4369-b2f8-111de04febce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30012fbf-8677-4369-b2f8-111de04febce
Content-Type: application/json

--- request body ---
{"handle":"qa-ab8900b84ee5","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-30012fbf-8677-4369-b2f8-111de04febce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71ac5399-2b6c-4d3b-96eb-69f917f7a226"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e297ccf7-d828-4a39-9474-fb3d8eeeb750

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e297ccf7-d828-4a39-9474-fb3d8eeeb750
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e297ccf7-d828-4a39-9474-fb3d8eeeb750
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
correlation: qa-de25fd0e-a8be-421b-8a31-36d11cadbe21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de25fd0e-a8be-421b-8a31-36d11cadbe21
Content-Type: application/json

--- request body ---
{"handle":"qa-ab8900b84ee5","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de25fd0e-a8be-421b-8a31-36d11cadbe21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de25fd0e-a8be-421b-8a31-36d11cadbe21"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-837a23c3-5d99-44ac-9482-e27cb4167683

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-837a23c3-5d99-44ac-9482-e27cb4167683
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-837a23c3-5d99-44ac-9482-e27cb4167683
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
correlation: qa-98089c72-827c-451e-a654-c736e2140726

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98089c72-827c-451e-a654-c736e2140726
Content-Type: application/json

--- request body ---
{"handle":"qa-26d4bfb23c58","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98089c72-827c-451e-a654-c736e2140726
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98089c72-827c-451e-a654-c736e2140726"}
```
