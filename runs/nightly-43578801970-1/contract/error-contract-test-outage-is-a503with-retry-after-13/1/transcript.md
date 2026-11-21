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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-e61561fb-ce60-4100-9da2-c869e42225a2` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-e5238455-c43b-4889-8177-a766f06086b6` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-053a18f0-9f0c-4af0-80b7-652f7304d46e` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-c41dd5f9-9adb-43b5-98f2-acd7bd5bd187` |
| 5 | `GET /v1/credits/balance` | 503 | 53 | `qa-98a7f4f7-e55a-40e6-b626-6eab279b51ad` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-8de67cb6-f269-486b-b05f-fe88125b39aa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-56dbabbe-211b-4167-8de9-0e2e5f72cabc` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-3925067d-1f90-4788-820d-093fb1646c0c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ef166475-6658-492e-adb8-a4023785a761` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-ee6544f8-086f-4057-b356-daba1c6c5e69` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e61561fb-ce60-4100-9da2-c869e42225a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e61561fb-ce60-4100-9da2-c869e42225a2
Content-Type: application/json

--- request body ---
{"handle":"qa-b548c4c1a6ed","displayName":"QA b548c4c1a6ed","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e61561fb-ce60-4100-9da2-c869e42225a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Location: /v1/accounts/qa-b548c4c1a6ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d57f25fd-5c40-4814-bfaf-2bb039d018e1","handle":"qa-b548c4c1a6ed","displayName":"QA b548c4c1a6ed","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.371248949Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e5238455-c43b-4889-8177-a766f06086b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5238455-c43b-4889-8177-a766f06086b6
Content-Type: application/json

--- request body ---
{"handle":"qa-dd0ccd276e3e","displayName":"QA dd0ccd276e3e","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5238455-c43b-4889-8177-a766f06086b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-dd0ccd276e3e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e17684a-88cd-41bb-941f-c04298e28772","handle":"qa-dd0ccd276e3e","displayName":"QA dd0ccd276e3e","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.433040956Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-053a18f0-9f0c-4af0-80b7-652f7304d46e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-053a18f0-9f0c-4af0-80b7-652f7304d46e
Content-Type: application/json

--- request body ---
{"handle":"qa-b548c4c1a6ed","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-053a18f0-9f0c-4af0-80b7-652f7304d46e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d57f25fd-5c40-4814-bfaf-2bb039d018e1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c41dd5f9-9adb-43b5-98f2-acd7bd5bd187

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c41dd5f9-9adb-43b5-98f2-acd7bd5bd187
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dd0ccd276e3e","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c41dd5f9-9adb-43b5-98f2-acd7bd5bd187
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
Location: /v1/conversations/cnv_4c2219c6-59e8-4fd6-8ea9-27c3a20085c6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4c2219c6-59e8-4fd6-8ea9-27c3a20085c6","subject":"Error contract","status":"open","region":"eu","participants":["qa-b548c4c1a6ed","qa-dd0ccd276e3e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.495544386Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-98a7f4f7-e55a-40e6-b626-6eab279b51ad

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: dfb8c8d8-d74f-4924-ad98-6b2984204fce
X-Correlation-Id: qa-98a7f4f7-e55a-40e6-b626-6eab279b51ad
Content-Type: application/json

--- response: 503 in 53 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98a7f4f7-e55a-40e6-b626-6eab279b51ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-98a7f4f7-e55a-40e6-b626-6eab279b51ad"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8de67cb6-f269-486b-b05f-fe88125b39aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8de67cb6-f269-486b-b05f-fe88125b39aa
Content-Type: application/json

--- request body ---
{"handle":"qa-dd0ccd276e3e","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8de67cb6-f269-486b-b05f-fe88125b39aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e17684a-88cd-41bb-941f-c04298e28772"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56dbabbe-211b-4167-8de9-0e2e5f72cabc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56dbabbe-211b-4167-8de9-0e2e5f72cabc
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56dbabbe-211b-4167-8de9-0e2e5f72cabc
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
correlation: qa-3925067d-1f90-4788-820d-093fb1646c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3925067d-1f90-4788-820d-093fb1646c0c
Content-Type: application/json

--- request body ---
{"handle":"qa-dd0ccd276e3e","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3925067d-1f90-4788-820d-093fb1646c0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3925067d-1f90-4788-820d-093fb1646c0c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef166475-6658-492e-adb8-a4023785a761

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef166475-6658-492e-adb8-a4023785a761
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef166475-6658-492e-adb8-a4023785a761
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
correlation: qa-ee6544f8-086f-4057-b356-daba1c6c5e69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee6544f8-086f-4057-b356-daba1c6c5e69
Content-Type: application/json

--- request body ---
{"handle":"qa-b548c4c1a6ed","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee6544f8-086f-4057-b356-daba1c6c5e69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee6544f8-086f-4057-b356-daba1c6c5e69"}
```
