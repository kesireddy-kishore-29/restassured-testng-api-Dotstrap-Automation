# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-799b480a-d0eb-4fdf-bcda-079b556bdcd7` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-6ca41283-b11d-4971-8f8f-d6092450bb08` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-a6107e21-02cb-4790-9d72-71f8eaa16ef7` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-273e3eac-b5f6-4193-b382-2fd0e3b2384a` |
| 5 | `GET /v1/credits/balance` | 503 | 12 | `qa-dbcba414-4aea-4766-8166-fc05c16e4d68` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-9bf3bfa6-5862-44cc-a329-2a0496bd86e3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-f5b5e29e-71c3-42c1-804b-fe888ea031fa` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-1e94508e-3f3a-4924-9763-5ccade639d22` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-d40a658c-26a2-4775-b151-7c04643ed5fe` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-5f345af5-00cd-452a-b1f3-b97f950b17c6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-799b480a-d0eb-4fdf-bcda-079b556bdcd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-799b480a-d0eb-4fdf-bcda-079b556bdcd7
Content-Type: application/json

--- request body ---
{"handle":"qa-455fdfae35de","displayName":"QA 455fdfae35de","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-799b480a-d0eb-4fdf-bcda-079b556bdcd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Location: /v1/accounts/qa-455fdfae35de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38b58afa-d2ab-4485-952f-013d12d89374","handle":"qa-455fdfae35de","displayName":"QA 455fdfae35de","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.594384641Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6ca41283-b11d-4971-8f8f-d6092450bb08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ca41283-b11d-4971-8f8f-d6092450bb08
Content-Type: application/json

--- request body ---
{"handle":"qa-6c6f36193798","displayName":"QA 6c6f36193798","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ca41283-b11d-4971-8f8f-d6092450bb08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Location: /v1/accounts/qa-6c6f36193798
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed273785-5441-428e-b71b-d9e0070a922e","handle":"qa-6c6f36193798","displayName":"QA 6c6f36193798","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.649359908Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a6107e21-02cb-4790-9d72-71f8eaa16ef7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6107e21-02cb-4790-9d72-71f8eaa16ef7
Content-Type: application/json

--- request body ---
{"handle":"qa-455fdfae35de","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6107e21-02cb-4790-9d72-71f8eaa16ef7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38b58afa-d2ab-4485-952f-013d12d89374"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-273e3eac-b5f6-4193-b382-2fd0e3b2384a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-273e3eac-b5f6-4193-b382-2fd0e3b2384a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6c6f36193798","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-273e3eac-b5f6-4193-b382-2fd0e3b2384a
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
Location: /v1/conversations/cnv_dc46190d-d39b-42fb-93c5-be9fd426e362
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dc46190d-d39b-42fb-93c5-be9fd426e362","subject":"Error contract","status":"open","region":"eu","participants":["qa-455fdfae35de","qa-6c6f36193798"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.703716536Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-dbcba414-4aea-4766-8166-fc05c16e4d68

--- request headers ---
Accept: application/json
X-Fault-Key: dc7909a8-4562-40cf-8a74-8576a17862ca
X-Fault: unavailable-once
X-Correlation-Id: qa-dbcba414-4aea-4766-8166-fc05c16e4d68
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbcba414-4aea-4766-8166-fc05c16e4d68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-dbcba414-4aea-4766-8166-fc05c16e4d68"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9bf3bfa6-5862-44cc-a329-2a0496bd86e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bf3bfa6-5862-44cc-a329-2a0496bd86e3
Content-Type: application/json

--- request body ---
{"handle":"qa-6c6f36193798","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bf3bfa6-5862-44cc-a329-2a0496bd86e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed273785-5441-428e-b71b-d9e0070a922e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f5b5e29e-71c3-42c1-804b-fe888ea031fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5b5e29e-71c3-42c1-804b-fe888ea031fa
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f5b5e29e-71c3-42c1-804b-fe888ea031fa
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
correlation: qa-1e94508e-3f3a-4924-9763-5ccade639d22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e94508e-3f3a-4924-9763-5ccade639d22
Content-Type: application/json

--- request body ---
{"handle":"qa-6c6f36193798","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e94508e-3f3a-4924-9763-5ccade639d22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e94508e-3f3a-4924-9763-5ccade639d22"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d40a658c-26a2-4775-b151-7c04643ed5fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d40a658c-26a2-4775-b151-7c04643ed5fe
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d40a658c-26a2-4775-b151-7c04643ed5fe
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
correlation: qa-5f345af5-00cd-452a-b1f3-b97f950b17c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f345af5-00cd-452a-b1f3-b97f950b17c6
Content-Type: application/json

--- request body ---
{"handle":"qa-455fdfae35de","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f345af5-00cd-452a-b1f3-b97f950b17c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f345af5-00cd-452a-b1f3-b97f950b17c6"}
```
