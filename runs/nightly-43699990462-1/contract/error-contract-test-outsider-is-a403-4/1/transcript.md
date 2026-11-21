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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-c8d3577b-8b4b-4761-8134-20d1f509bbc4` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-398f5819-19e5-4a6d-93e9-bebc14d01da0` |
| 3 | `POST /v1/accounts` | 201 | 14 | `qa-4991b891-325b-4bc8-9f0a-8ebfb8ea714b` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-0bb88e09-30bf-4393-8b96-24134996bd96` |
| 5 | `POST /v1/conversations` | 201 | 20 | `qa-103a5da9-d88f-4027-9a83-caf489fdf8fe` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-953729b0-7d45-469d-9026-21d35f5e0025` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 10 | `qa-9cc69ada-bc6f-4983-afd1-91ecd8d89607` |
| 8 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-c1b89910-eca4-4fb0-a92c-cdba36620983` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-53f42216-96c4-4640-abdb-35594050d641` |
| 10 | `POST /v1/auth/token` | 200 | 34 | `qa-bda98f81-15b0-4607-b7a7-1239ba7ad5e7` |
| 11 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-b80b1abb-218b-439a-a9f3-c435852ad528` |
| 12 | `POST /v1/auth/token` | 401 | 8 | `qa-ff809a9e-5367-4dc2-8415-4052725a6de0` |
| 13 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-7c9dd587-9aa9-4f06-b3e8-6c55c2960138` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-20ce748e-0cb5-433f-8941-fdd12ddecebc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c8d3577b-8b4b-4761-8134-20d1f509bbc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8d3577b-8b4b-4761-8134-20d1f509bbc4
Content-Type: application/json

--- request body ---
{"handle":"qa-8f90d5cdeb7d","displayName":"QA 8f90d5cdeb7d","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8d3577b-8b4b-4761-8134-20d1f509bbc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-8f90d5cdeb7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4aa366d8-7752-4036-a5d6-7a111d82042b","handle":"qa-8f90d5cdeb7d","displayName":"QA 8f90d5cdeb7d","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.422809045Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-398f5819-19e5-4a6d-93e9-bebc14d01da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-398f5819-19e5-4a6d-93e9-bebc14d01da0
Content-Type: application/json

--- request body ---
{"handle":"qa-9066f28d9b33","displayName":"QA 9066f28d9b33","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-398f5819-19e5-4a6d-93e9-bebc14d01da0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Location: /v1/accounts/qa-9066f28d9b33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8afe3ac7-ffe2-4ddd-90c1-024b5eb2a7cd","handle":"qa-9066f28d9b33","displayName":"QA 9066f28d9b33","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.529614156Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-4991b891-325b-4bc8-9f0a-8ebfb8ea714b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4991b891-325b-4bc8-9f0a-8ebfb8ea714b
Content-Type: application/json

--- request body ---
{"handle":"qa-a8b649ce36a9","displayName":"QA a8b649ce36a9","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4991b891-325b-4bc8-9f0a-8ebfb8ea714b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Location: /v1/accounts/qa-a8b649ce36a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23e96537-eea2-497b-b1c8-78e669bce0ec","handle":"qa-a8b649ce36a9","displayName":"QA a8b649ce36a9","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.553429688Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0bb88e09-30bf-4393-8b96-24134996bd96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bb88e09-30bf-4393-8b96-24134996bd96
Content-Type: application/json

--- request body ---
{"handle":"qa-8f90d5cdeb7d","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bb88e09-30bf-4393-8b96-24134996bd96
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4aa366d8-7752-4036-a5d6-7a111d82042b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-103a5da9-d88f-4027-9a83-caf489fdf8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-103a5da9-d88f-4027-9a83-caf489fdf8fe
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9066f28d9b33","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-103a5da9-d88f-4027-9a83-caf489fdf8fe
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
Location: /v1/conversations/cnv_0c7ab97a-e06b-42e5-bd27-e0833fc6c966
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0c7ab97a-e06b-42e5-bd27-e0833fc6c966","subject":"Error contract","status":"open","region":"eu","participants":["qa-8f90d5cdeb7d","qa-9066f28d9b33"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.606866560Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-953729b0-7d45-469d-9026-21d35f5e0025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-953729b0-7d45-469d-9026-21d35f5e0025
Content-Type: application/json

--- request body ---
{"handle":"qa-a8b649ce36a9","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-953729b0-7d45-469d-9026-21d35f5e0025
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23e96537-eea2-497b-b1c8-78e669bce0ec"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_0c7ab97a-e06b-42e5-bd27-e0833fc6c966/close
correlation: qa-9cc69ada-bc6f-4983-afd1-91ecd8d89607

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cc69ada-bc6f-4983-afd1-91ecd8d89607
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cc69ada-bc6f-4983-afd1-91ecd8d89607
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0c7ab97a-e06b-42e5-bd27-e0833fc6c966/close","correlationId":"qa-9cc69ada-bc6f-4983-afd1-91ecd8d89607"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1b89910-eca4-4fb0-a92c-cdba36620983

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1b89910-eca4-4fb0-a92c-cdba36620983
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1b89910-eca4-4fb0-a92c-cdba36620983
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
correlation: qa-53f42216-96c4-4640-abdb-35594050d641

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53f42216-96c4-4640-abdb-35594050d641
Content-Type: application/json

--- request body ---
{"handle":"qa-a8b649ce36a9","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53f42216-96c4-4640-abdb-35594050d641
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-53f42216-96c4-4640-abdb-35594050d641"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bda98f81-15b0-4607-b7a7-1239ba7ad5e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bda98f81-15b0-4607-b7a7-1239ba7ad5e7
Content-Type: application/json

--- request body ---
{"handle":"qa-9066f28d9b33","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-bda98f81-15b0-4607-b7a7-1239ba7ad5e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8afe3ac7-ffe2-4ddd-90c1-024b5eb2a7cd"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b80b1abb-218b-439a-a9f3-c435852ad528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b80b1abb-218b-439a-a9f3-c435852ad528
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b80b1abb-218b-439a-a9f3-c435852ad528
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
correlation: qa-ff809a9e-5367-4dc2-8415-4052725a6de0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff809a9e-5367-4dc2-8415-4052725a6de0
Content-Type: application/json

--- request body ---
{"handle":"qa-9066f28d9b33","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff809a9e-5367-4dc2-8415-4052725a6de0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ff809a9e-5367-4dc2-8415-4052725a6de0"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c9dd587-9aa9-4f06-b3e8-6c55c2960138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c9dd587-9aa9-4f06-b3e8-6c55c2960138
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c9dd587-9aa9-4f06-b3e8-6c55c2960138
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
correlation: qa-20ce748e-0cb5-433f-8941-fdd12ddecebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20ce748e-0cb5-433f-8941-fdd12ddecebc
Content-Type: application/json

--- request body ---
{"handle":"qa-8f90d5cdeb7d","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20ce748e-0cb5-433f-8941-fdd12ddecebc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-20ce748e-0cb5-433f-8941-fdd12ddecebc"}
```
