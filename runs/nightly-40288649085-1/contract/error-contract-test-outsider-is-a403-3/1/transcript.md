# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-12430adc-a4ca-4ce0-84bb-ce647ea6f9ca` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-37b231a6-a674-4d2c-9655-b01ebfe556cf` |
| 3 | `POST /v1/accounts` | 201 | 21 | `qa-a39d0c43-7729-4c59-a53e-4378b9f8a8ab` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-3d3a287a-3e88-4ca2-a67e-1ecec058e01c` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-57ae0607-1b59-413c-8dcd-6cb66a209ded` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-90f0243c-d9c7-4911-8824-1d1aa2235fac` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 6 | `qa-e284408c-43b5-48ce-9b80-e931c160c583` |
| 8 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-b662ce47-08d3-4c6b-8ca2-bc9b193169cc` |
| 9 | `POST /v1/auth/token` | 401 | 23 | `qa-4931239d-d6d4-465c-ae3d-a5cc45a8e4ab` |
| 10 | `POST /v1/auth/token` | 200 | 34 | `qa-57f42e85-f851-44d6-9d70-f505461d64bb` |
| 11 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-58389f5b-f275-4076-af75-55e4dea92c73` |
| 12 | `POST /v1/auth/token` | 401 | 51 | `qa-7410a443-7e79-4e72-b816-9bca1a38f73e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-7af16312-5828-4d3f-9eec-2fb53e41d8ac` |
| 14 | `POST /v1/auth/token` | 401 | 24 | `qa-14691a34-f1f6-41db-8277-ed4ee726337e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12430adc-a4ca-4ce0-84bb-ce647ea6f9ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12430adc-a4ca-4ce0-84bb-ce647ea6f9ca
Content-Type: application/json

--- request body ---
{"handle":"qa-d6870b3bab00","displayName":"QA d6870b3bab00","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-12430adc-a4ca-4ce0-84bb-ce647ea6f9ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-d6870b3bab00
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6dda60d-5ca3-46a2-9699-4e8b4f9ad59d","handle":"qa-d6870b3bab00","displayName":"QA d6870b3bab00","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.424948066Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-37b231a6-a674-4d2c-9655-b01ebfe556cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37b231a6-a674-4d2c-9655-b01ebfe556cf
Content-Type: application/json

--- request body ---
{"handle":"qa-9cb19981ef95","displayName":"QA 9cb19981ef95","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-37b231a6-a674-4d2c-9655-b01ebfe556cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-9cb19981ef95
X-Served-Region: eu
Content-Length: 181

{"id":"acc_300efb53-f985-4142-acf9-ad44cee6ac0e","handle":"qa-9cb19981ef95","displayName":"QA 9cb19981ef95","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.477822425Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a39d0c43-7729-4c59-a53e-4378b9f8a8ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a39d0c43-7729-4c59-a53e-4378b9f8a8ab
Content-Type: application/json

--- request body ---
{"handle":"qa-2791823f5ed5","displayName":"QA 2791823f5ed5","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a39d0c43-7729-4c59-a53e-4378b9f8a8ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-2791823f5ed5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7d4e2fe-62a3-4f61-ab87-38aca0d8e604","handle":"qa-2791823f5ed5","displayName":"QA 2791823f5ed5","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.515280242Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3d3a287a-3e88-4ca2-a67e-1ecec058e01c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d3a287a-3e88-4ca2-a67e-1ecec058e01c
Content-Type: application/json

--- request body ---
{"handle":"qa-d6870b3bab00","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d3a287a-3e88-4ca2-a67e-1ecec058e01c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6dda60d-5ca3-46a2-9699-4e8b4f9ad59d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-57ae0607-1b59-413c-8dcd-6cb66a209ded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57ae0607-1b59-413c-8dcd-6cb66a209ded
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9cb19981ef95","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-57ae0607-1b59-413c-8dcd-6cb66a209ded
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
Location: /v1/conversations/cnv_ae5c69bd-e232-4d24-a36f-07f055a8b000
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ae5c69bd-e232-4d24-a36f-07f055a8b000","subject":"Error contract","status":"open","region":"eu","participants":["qa-d6870b3bab00","qa-9cb19981ef95"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.575991237Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-90f0243c-d9c7-4911-8824-1d1aa2235fac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90f0243c-d9c7-4911-8824-1d1aa2235fac
Content-Type: application/json

--- request body ---
{"handle":"qa-2791823f5ed5","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-90f0243c-d9c7-4911-8824-1d1aa2235fac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7d4e2fe-62a3-4f61-ab87-38aca0d8e604"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ae5c69bd-e232-4d24-a36f-07f055a8b000/read
correlation: qa-e284408c-43b5-48ce-9b80-e931c160c583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e284408c-43b5-48ce-9b80-e931c160c583
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e284408c-43b5-48ce-9b80-e931c160c583
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ae5c69bd-e232-4d24-a36f-07f055a8b000/read","correlationId":"qa-e284408c-43b5-48ce-9b80-e931c160c583"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b662ce47-08d3-4c6b-8ca2-bc9b193169cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b662ce47-08d3-4c6b-8ca2-bc9b193169cc
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b662ce47-08d3-4c6b-8ca2-bc9b193169cc
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
correlation: qa-4931239d-d6d4-465c-ae3d-a5cc45a8e4ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4931239d-d6d4-465c-ae3d-a5cc45a8e4ab
Content-Type: application/json

--- request body ---
{"handle":"qa-2791823f5ed5","password":"****"}

--- response: 401 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4931239d-d6d4-465c-ae3d-a5cc45a8e4ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4931239d-d6d4-465c-ae3d-a5cc45a8e4ab"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-57f42e85-f851-44d6-9d70-f505461d64bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57f42e85-f851-44d6-9d70-f505461d64bb
Content-Type: application/json

--- request body ---
{"handle":"qa-9cb19981ef95","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-57f42e85-f851-44d6-9d70-f505461d64bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_300efb53-f985-4142-acf9-ad44cee6ac0e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58389f5b-f275-4076-af75-55e4dea92c73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58389f5b-f275-4076-af75-55e4dea92c73
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58389f5b-f275-4076-af75-55e4dea92c73
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
correlation: qa-7410a443-7e79-4e72-b816-9bca1a38f73e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7410a443-7e79-4e72-b816-9bca1a38f73e
Content-Type: application/json

--- request body ---
{"handle":"qa-9cb19981ef95","password":"****"}

--- response: 401 in 51 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7410a443-7e79-4e72-b816-9bca1a38f73e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7410a443-7e79-4e72-b816-9bca1a38f73e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7af16312-5828-4d3f-9eec-2fb53e41d8ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7af16312-5828-4d3f-9eec-2fb53e41d8ac
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7af16312-5828-4d3f-9eec-2fb53e41d8ac
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
correlation: qa-14691a34-f1f6-41db-8277-ed4ee726337e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14691a34-f1f6-41db-8277-ed4ee726337e
Content-Type: application/json

--- request body ---
{"handle":"qa-d6870b3bab00","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14691a34-f1f6-41db-8277-ed4ee726337e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-14691a34-f1f6-41db-8277-ed4ee726337e"}
```
