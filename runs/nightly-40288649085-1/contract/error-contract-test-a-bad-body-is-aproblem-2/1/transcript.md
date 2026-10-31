# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-bd458d06-8c89-477b-b73d-78e5f8ad637a` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-b8ea551c-b2ed-4e1f-8540-b20b2e62e63e` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-f5de655e-c373-42d1-8465-badb9788bb6f` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-fa36f305-b066-47ee-99bd-d9098abf9529` |
| 5 | `POST /v1/auth/token` | 422 | 38 | `qa-20119666-ff11-436d-9998-f458e95de892` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-1d2f7ef9-078e-4d78-ae49-ffa4499e198f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-ac0e359e-7b47-45f1-a774-057252b07d60` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-9aac8121-721e-4362-9f82-9f5ce1a455f6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 67 | `qa-d3216c7c-d92d-4c89-86d1-d1b89e85a236` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-fc0fd371-aed4-45b3-a34f-43fb40b0fe9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd458d06-8c89-477b-b73d-78e5f8ad637a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd458d06-8c89-477b-b73d-78e5f8ad637a
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f4217c84db","displayName":"QA a9f4217c84db","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd458d06-8c89-477b-b73d-78e5f8ad637a
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
Location: /v1/accounts/qa-a9f4217c84db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_037193c6-14d6-425e-897b-f148fbb94c8b","handle":"qa-a9f4217c84db","displayName":"QA a9f4217c84db","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.265573578Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b8ea551c-b2ed-4e1f-8540-b20b2e62e63e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8ea551c-b2ed-4e1f-8540-b20b2e62e63e
Content-Type: application/json

--- request body ---
{"handle":"qa-8a7deac246b1","displayName":"QA 8a7deac246b1","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8ea551c-b2ed-4e1f-8540-b20b2e62e63e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-8a7deac246b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c99f006f-3820-4956-bd15-5e933aa6b066","handle":"qa-8a7deac246b1","displayName":"QA 8a7deac246b1","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.289423361Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f5de655e-c373-42d1-8465-badb9788bb6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5de655e-c373-42d1-8465-badb9788bb6f
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f4217c84db","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5de655e-c373-42d1-8465-badb9788bb6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_037193c6-14d6-425e-897b-f148fbb94c8b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fa36f305-b066-47ee-99bd-d9098abf9529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa36f305-b066-47ee-99bd-d9098abf9529
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8a7deac246b1","subject":"Error contract","message":"Hi"}

--- response: 201 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa36f305-b066-47ee-99bd-d9098abf9529
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
Location: /v1/conversations/cnv_5007e56c-37cb-405e-8e22-6be89bdbc803
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5007e56c-37cb-405e-8e22-6be89bdbc803","subject":"Error contract","status":"open","region":"eu","participants":["qa-a9f4217c84db","qa-8a7deac246b1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.367999214Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-20119666-ff11-436d-9998-f458e95de892

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20119666-ff11-436d-9998-f458e95de892
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f4217c84db","password":"****","ttlSeconds":0}

--- response: 422 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20119666-ff11-436d-9998-f458e95de892
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-20119666-ff11-436d-9998-f458e95de892","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1d2f7ef9-078e-4d78-ae49-ffa4499e198f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d2f7ef9-078e-4d78-ae49-ffa4499e198f
Content-Type: application/json

--- request body ---
{"handle":"qa-8a7deac246b1","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d2f7ef9-078e-4d78-ae49-ffa4499e198f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c99f006f-3820-4956-bd15-5e933aa6b066"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac0e359e-7b47-45f1-a774-057252b07d60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac0e359e-7b47-45f1-a774-057252b07d60
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac0e359e-7b47-45f1-a774-057252b07d60
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
correlation: qa-9aac8121-721e-4362-9f82-9f5ce1a455f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aac8121-721e-4362-9f82-9f5ce1a455f6
Content-Type: application/json

--- request body ---
{"handle":"qa-8a7deac246b1","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9aac8121-721e-4362-9f82-9f5ce1a455f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9aac8121-721e-4362-9f82-9f5ce1a455f6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3216c7c-d92d-4c89-86d1-d1b89e85a236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3216c7c-d92d-4c89-86d1-d1b89e85a236
Content-Type: application/json

--- response: 204 in 67 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3216c7c-d92d-4c89-86d1-d1b89e85a236
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
correlation: qa-fc0fd371-aed4-45b3-a34f-43fb40b0fe9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc0fd371-aed4-45b3-a34f-43fb40b0fe9d
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f4217c84db","password":"****"}

--- response: 401 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc0fd371-aed4-45b3-a34f-43fb40b0fe9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc0fd371-aed4-45b3-a34f-43fb40b0fe9d"}
```
