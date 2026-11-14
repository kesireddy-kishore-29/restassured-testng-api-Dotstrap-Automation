# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-9f8e4edf-07d6-4016-bca0-86c9174e8a7a` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-4df44cc9-48fe-4118-adc5-d84e925aeed1` |
| 3 | `POST /v1/accounts` | 201 | 17 | `qa-2ac69d37-3364-4e22-b42b-165f61b74c24` |
| 4 | `POST /v1/auth/token` | 200 | 32 | `qa-38f2c48c-4838-447a-ab39-782a7094795f` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-d7b62e69-cad3-4fa9-83eb-16131d4af973` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-362bead3-6912-40b5-ab8b-62ac455d2e83` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 8 | `qa-807c3e6c-9ba1-4811-91c0-b1f67a9c8ca4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-45281355-70e4-431e-ab1c-7f9a10961818` |
| 9 | `POST /v1/auth/token` | 401 | 18 | `qa-25f5b523-ab9e-4400-aa3b-6c88764c43e6` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-18577bc2-e0da-4bb7-8d0d-f5f03effc412` |
| 11 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7cb25fab-61e9-4f40-9410-f6d6bdc56672` |
| 12 | `POST /v1/auth/token` | 401 | 10 | `qa-fa0cfe31-ce5f-4d86-b60b-833037f195de` |
| 13 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-ce29d09e-c727-40d7-a839-522b05e4ec84` |
| 14 | `POST /v1/auth/token` | 401 | 25 | `qa-b12f830c-3689-4f57-9289-c9f4984793f5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9f8e4edf-07d6-4016-bca0-86c9174e8a7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f8e4edf-07d6-4016-bca0-86c9174e8a7a
Content-Type: application/json

--- request body ---
{"handle":"qa-6f4a7c3b16c6","displayName":"QA 6f4a7c3b16c6","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f8e4edf-07d6-4016-bca0-86c9174e8a7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Location: /v1/accounts/qa-6f4a7c3b16c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e70e3061-3b18-49c2-a0d3-65d7364ad61b","handle":"qa-6f4a7c3b16c6","displayName":"QA 6f4a7c3b16c6","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.463918188Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4df44cc9-48fe-4118-adc5-d84e925aeed1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4df44cc9-48fe-4118-adc5-d84e925aeed1
Content-Type: application/json

--- request body ---
{"handle":"qa-7bd539185b0b","displayName":"QA 7bd539185b0b","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4df44cc9-48fe-4118-adc5-d84e925aeed1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Location: /v1/accounts/qa-7bd539185b0b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f95efa1-da25-4a5c-ac1a-33cfbaf61e4a","handle":"qa-7bd539185b0b","displayName":"QA 7bd539185b0b","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.518186160Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2ac69d37-3364-4e22-b42b-165f61b74c24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ac69d37-3364-4e22-b42b-165f61b74c24
Content-Type: application/json

--- request body ---
{"handle":"qa-2f9846188d51","displayName":"QA 2f9846188d51","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ac69d37-3364-4e22-b42b-165f61b74c24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Location: /v1/accounts/qa-2f9846188d51
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8875827-0ac8-42ca-b150-5451d00cd07a","handle":"qa-2f9846188d51","displayName":"QA 2f9846188d51","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.567094308Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-38f2c48c-4838-447a-ab39-782a7094795f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38f2c48c-4838-447a-ab39-782a7094795f
Content-Type: application/json

--- request body ---
{"handle":"qa-6f4a7c3b16c6","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-38f2c48c-4838-447a-ab39-782a7094795f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e70e3061-3b18-49c2-a0d3-65d7364ad61b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d7b62e69-cad3-4fa9-83eb-16131d4af973

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7b62e69-cad3-4fa9-83eb-16131d4af973
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7bd539185b0b","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7b62e69-cad3-4fa9-83eb-16131d4af973
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
Location: /v1/conversations/cnv_c9ea4119-a0a9-45f1-82c4-bddd7c41bc77
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c9ea4119-a0a9-45f1-82c4-bddd7c41bc77","subject":"Error contract","status":"open","region":"eu","participants":["qa-6f4a7c3b16c6","qa-7bd539185b0b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.665527647Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-362bead3-6912-40b5-ab8b-62ac455d2e83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-362bead3-6912-40b5-ab8b-62ac455d2e83
Content-Type: application/json

--- request body ---
{"handle":"qa-2f9846188d51","password":"****"}

--- response: 200 in 43 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-362bead3-6912-40b5-ab8b-62ac455d2e83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8875827-0ac8-42ca-b150-5451d00cd07a"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c9ea4119-a0a9-45f1-82c4-bddd7c41bc77/close
correlation: qa-807c3e6c-9ba1-4811-91c0-b1f67a9c8ca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-807c3e6c-9ba1-4811-91c0-b1f67a9c8ca4
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-807c3e6c-9ba1-4811-91c0-b1f67a9c8ca4
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c9ea4119-a0a9-45f1-82c4-bddd7c41bc77/close","correlationId":"qa-807c3e6c-9ba1-4811-91c0-b1f67a9c8ca4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45281355-70e4-431e-ab1c-7f9a10961818

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45281355-70e4-431e-ab1c-7f9a10961818
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45281355-70e4-431e-ab1c-7f9a10961818
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-25f5b523-ab9e-4400-aa3b-6c88764c43e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25f5b523-ab9e-4400-aa3b-6c88764c43e6
Content-Type: application/json

--- request body ---
{"handle":"qa-2f9846188d51","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25f5b523-ab9e-4400-aa3b-6c88764c43e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25f5b523-ab9e-4400-aa3b-6c88764c43e6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-18577bc2-e0da-4bb7-8d0d-f5f03effc412

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18577bc2-e0da-4bb7-8d0d-f5f03effc412
Content-Type: application/json

--- request body ---
{"handle":"qa-7bd539185b0b","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-18577bc2-e0da-4bb7-8d0d-f5f03effc412
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f95efa1-da25-4a5c-ac1a-33cfbaf61e4a"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7cb25fab-61e9-4f40-9410-f6d6bdc56672

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cb25fab-61e9-4f40-9410-f6d6bdc56672
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7cb25fab-61e9-4f40-9410-f6d6bdc56672
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-fa0cfe31-ce5f-4d86-b60b-833037f195de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa0cfe31-ce5f-4d86-b60b-833037f195de
Content-Type: application/json

--- request body ---
{"handle":"qa-7bd539185b0b","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa0cfe31-ce5f-4d86-b60b-833037f195de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa0cfe31-ce5f-4d86-b60b-833037f195de"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce29d09e-c727-40d7-a839-522b05e4ec84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce29d09e-c727-40d7-a839-522b05e4ec84
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce29d09e-c727-40d7-a839-522b05e4ec84
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-b12f830c-3689-4f57-9289-c9f4984793f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b12f830c-3689-4f57-9289-c9f4984793f5
Content-Type: application/json

--- request body ---
{"handle":"qa-6f4a7c3b16c6","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b12f830c-3689-4f57-9289-c9f4984793f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b12f830c-3689-4f57-9289-c9f4984793f5"}
```
