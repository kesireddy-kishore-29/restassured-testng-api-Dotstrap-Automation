# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-31a6920e-859f-4791-8360-c98a1a7af7ee` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-820ad689-656f-4d00-b4dd-6d98878652f5` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-c3eb97c2-1c4d-488b-ab79-f920080e255d` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-55c60fd0-d107-4a6a-9e1d-3aa738539fcc` |
| 5 | `POST /v1/credits/purchases` | 400 | 25 | `qa-2c68b11b-06f6-41ba-909e-22439833e984` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-05367ea8-08d8-4ec0-bae1-6ffb035a0d63` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-982fc601-4747-42b7-8378-3435ae8190f1` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-8990447a-cae3-4ff2-b402-a66292c561f4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 77 | `qa-1ff05029-e031-4858-accd-be9a3641c2cd` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-56cd8db5-855e-4f41-abb2-a40a59b4d6f8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-31a6920e-859f-4791-8360-c98a1a7af7ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31a6920e-859f-4791-8360-c98a1a7af7ee
Content-Type: application/json

--- request body ---
{"handle":"qa-593920660156","displayName":"QA 593920660156","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-31a6920e-859f-4791-8360-c98a1a7af7ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Location: /v1/accounts/qa-593920660156
X-Served-Region: eu
Content-Length: 181

{"id":"acc_51c216c4-be4c-4069-a5a4-2fa21f74430c","handle":"qa-593920660156","displayName":"QA 593920660156","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.470487899Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-820ad689-656f-4d00-b4dd-6d98878652f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-820ad689-656f-4d00-b4dd-6d98878652f5
Content-Type: application/json

--- request body ---
{"handle":"qa-9e85c6c6f916","displayName":"QA 9e85c6c6f916","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-820ad689-656f-4d00-b4dd-6d98878652f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Location: /v1/accounts/qa-9e85c6c6f916
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b0fcf31-2cd8-4b14-af23-cedc58b429ba","handle":"qa-9e85c6c6f916","displayName":"QA 9e85c6c6f916","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.534537096Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c3eb97c2-1c4d-488b-ab79-f920080e255d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3eb97c2-1c4d-488b-ab79-f920080e255d
Content-Type: application/json

--- request body ---
{"handle":"qa-593920660156","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3eb97c2-1c4d-488b-ab79-f920080e255d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51c216c4-be4c-4069-a5a4-2fa21f74430c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-55c60fd0-d107-4a6a-9e1d-3aa738539fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55c60fd0-d107-4a6a-9e1d-3aa738539fcc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9e85c6c6f916","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-55c60fd0-d107-4a6a-9e1d-3aa738539fcc
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
Location: /v1/conversations/cnv_3edb298f-70b1-472d-8c8b-b3cc4be68430
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3edb298f-70b1-472d-8c8b-b3cc4be68430","subject":"Error contract","status":"open","region":"eu","participants":["qa-593920660156","qa-9e85c6c6f916"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.614827015Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2c68b11b-06f6-41ba-909e-22439833e984

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6ef71dbc00f34db88357bd83d06c02c6
X-Correlation-Id: qa-2c68b11b-06f6-41ba-909e-22439833e984
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c68b11b-06f6-41ba-909e-22439833e984
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-2c68b11b-06f6-41ba-909e-22439833e984"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-05367ea8-08d8-4ec0-bae1-6ffb035a0d63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05367ea8-08d8-4ec0-bae1-6ffb035a0d63
Content-Type: application/json

--- request body ---
{"handle":"qa-9e85c6c6f916","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-05367ea8-08d8-4ec0-bae1-6ffb035a0d63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b0fcf31-2cd8-4b14-af23-cedc58b429ba"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-982fc601-4747-42b7-8378-3435ae8190f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-982fc601-4747-42b7-8378-3435ae8190f1
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-982fc601-4747-42b7-8378-3435ae8190f1
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
correlation: qa-8990447a-cae3-4ff2-b402-a66292c561f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8990447a-cae3-4ff2-b402-a66292c561f4
Content-Type: application/json

--- request body ---
{"handle":"qa-9e85c6c6f916","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8990447a-cae3-4ff2-b402-a66292c561f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8990447a-cae3-4ff2-b402-a66292c561f4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ff05029-e031-4858-accd-be9a3641c2cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ff05029-e031-4858-accd-be9a3641c2cd
Content-Type: application/json

--- response: 204 in 77 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ff05029-e031-4858-accd-be9a3641c2cd
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
correlation: qa-56cd8db5-855e-4f41-abb2-a40a59b4d6f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56cd8db5-855e-4f41-abb2-a40a59b4d6f8
Content-Type: application/json

--- request body ---
{"handle":"qa-593920660156","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56cd8db5-855e-4f41-abb2-a40a59b4d6f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56cd8db5-855e-4f41-abb2-a40a59b4d6f8"}
```
