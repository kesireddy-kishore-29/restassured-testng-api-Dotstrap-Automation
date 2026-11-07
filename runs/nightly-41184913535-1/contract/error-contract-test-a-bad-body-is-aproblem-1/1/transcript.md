# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 664 | `qa-5fc34f59-a5c3-40ab-8799-7168fa13667a` |
| 2 | `POST /v1/accounts` | 201 | 117 | `qa-c7ee4805-b395-452e-9c49-6d4f280e8278` |
| 3 | `POST /v1/auth/token` | 200 | 63 | `qa-1e285f06-420f-43e8-8979-d2afed0304e4` |
| 4 | `POST /v1/conversations` | 201 | 80 | `qa-a82fabd2-ee76-4518-869e-87e866120c6f` |
| 5 | `POST /v1/auth/token` | 415 | 43 | `qa-f072831b-a832-4d86-88c7-1253dc5895df` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-4ea1d8c9-f7c7-4935-a37f-9f50acdac7c4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4a4debcb-6ff9-4ca7-b86a-6a4bd90a8ac7` |
| 8 | `POST /v1/auth/token` | 401 | 59 | `qa-aa9a539c-6485-4133-a7a1-9b1aceec60e3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-286bc28c-db2d-4ae6-8ecb-4add5fa15bca` |
| 10 | `POST /v1/auth/token` | 401 | 31 | `qa-c6a2a97b-7a1a-4de0-8d45-4a3a18aeda72` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5fc34f59-a5c3-40ab-8799-7168fa13667a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fc34f59-a5c3-40ab-8799-7168fa13667a
Content-Type: application/json

--- request body ---
{"handle":"qa-fe2afdf96669","displayName":"QA fe2afdf96669","password":"****","region":"eu"}

--- response: 201 in 664 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fc34f59-a5c3-40ab-8799-7168fa13667a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-fe2afdf96669
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10ba7cbc-2f59-4a29-a8ca-5e9af335bdd8","handle":"qa-fe2afdf96669","displayName":"QA fe2afdf96669","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.886415476Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c7ee4805-b395-452e-9c49-6d4f280e8278

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7ee4805-b395-452e-9c49-6d4f280e8278
Content-Type: application/json

--- request body ---
{"handle":"qa-01fec6130d5d","displayName":"QA 01fec6130d5d","password":"****","region":"eu"}

--- response: 201 in 117 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7ee4805-b395-452e-9c49-6d4f280e8278
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-01fec6130d5d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ff3f457-f38a-4e5b-8cae-dd47841ab754","handle":"qa-01fec6130d5d","displayName":"QA 01fec6130d5d","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.348799665Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1e285f06-420f-43e8-8979-d2afed0304e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e285f06-420f-43e8-8979-d2afed0304e4
Content-Type: application/json

--- request body ---
{"handle":"qa-fe2afdf96669","password":"****"}

--- response: 200 in 63 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e285f06-420f-43e8-8979-d2afed0304e4
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10ba7cbc-2f59-4a29-a8ca-5e9af335bdd8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a82fabd2-ee76-4518-869e-87e866120c6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a82fabd2-ee76-4518-869e-87e866120c6f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-01fec6130d5d","subject":"Error contract","message":"Hi"}

--- response: 201 in 80 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a82fabd2-ee76-4518-869e-87e866120c6f
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
Location: /v1/conversations/cnv_82d9a766-08ad-4029-8ce7-c1fe44ee8df3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_82d9a766-08ad-4029-8ce7-c1fe44ee8df3","subject":"Error contract","status":"open","region":"eu","participants":["qa-fe2afdf96669","qa-01fec6130d5d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.551314439Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f072831b-a832-4d86-88c7-1253dc5895df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f072831b-a832-4d86-88c7-1253dc5895df
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 43 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f072831b-a832-4d86-88c7-1253dc5895df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-f072831b-a832-4d86-88c7-1253dc5895df"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4ea1d8c9-f7c7-4935-a37f-9f50acdac7c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ea1d8c9-f7c7-4935-a37f-9f50acdac7c4
Content-Type: application/json

--- request body ---
{"handle":"qa-01fec6130d5d","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ea1d8c9-f7c7-4935-a37f-9f50acdac7c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ff3f457-f38a-4e5b-8cae-dd47841ab754"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a4debcb-6ff9-4ca7-b86a-6a4bd90a8ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a4debcb-6ff9-4ca7-b86a-6a4bd90a8ac7
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a4debcb-6ff9-4ca7-b86a-6a4bd90a8ac7
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
correlation: qa-aa9a539c-6485-4133-a7a1-9b1aceec60e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa9a539c-6485-4133-a7a1-9b1aceec60e3
Content-Type: application/json

--- request body ---
{"handle":"qa-01fec6130d5d","password":"****"}

--- response: 401 in 59 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa9a539c-6485-4133-a7a1-9b1aceec60e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa9a539c-6485-4133-a7a1-9b1aceec60e3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-286bc28c-db2d-4ae6-8ecb-4add5fa15bca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-286bc28c-db2d-4ae6-8ecb-4add5fa15bca
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-286bc28c-db2d-4ae6-8ecb-4add5fa15bca
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
correlation: qa-c6a2a97b-7a1a-4de0-8d45-4a3a18aeda72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6a2a97b-7a1a-4de0-8d45-4a3a18aeda72
Content-Type: application/json

--- request body ---
{"handle":"qa-fe2afdf96669","password":"****"}

--- response: 401 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6a2a97b-7a1a-4de0-8d45-4a3a18aeda72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c6a2a97b-7a1a-4de0-8d45-4a3a18aeda72"}
```
