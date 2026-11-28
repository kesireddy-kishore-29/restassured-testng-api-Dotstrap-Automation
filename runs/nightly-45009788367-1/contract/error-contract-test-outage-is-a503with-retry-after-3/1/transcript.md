# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-68dbb416-ab41-42aa-a723-1cba4e9babf8` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-e1ea23cb-9dd9-4fb3-9ddb-9dd25d310e92` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-16398d00-b7db-46e9-ad6f-708df801857f` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-c6975547-07f6-42d3-b05a-1098832434fa` |
| 5 | `PATCH /v1/accounts/me` | 503 | 10 | `qa-710f0b40-3d7a-441d-9a68-3e5f7d7e6422` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-0c471599-d76e-44e5-9a30-cd2b0d45bcf0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-f59effe0-cbd2-4ead-a00a-ac64174177e8` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-6c7253e6-1b00-40eb-bb5a-ce896b071eff` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-358357fb-cfa8-48f6-abfd-0ce71ae2c39b` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-09fe49ad-aebd-4415-9449-b6905aa09709` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-68dbb416-ab41-42aa-a723-1cba4e9babf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68dbb416-ab41-42aa-a723-1cba4e9babf8
Content-Type: application/json

--- request body ---
{"handle":"qa-dabeae9788c2","displayName":"QA dabeae9788c2","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-68dbb416-ab41-42aa-a723-1cba4e9babf8
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
Location: /v1/accounts/qa-dabeae9788c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b12b2f27-3341-473b-bad0-b5aa18b8f244","handle":"qa-dabeae9788c2","displayName":"QA dabeae9788c2","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.386496539Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e1ea23cb-9dd9-4fb3-9ddb-9dd25d310e92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1ea23cb-9dd9-4fb3-9ddb-9dd25d310e92
Content-Type: application/json

--- request body ---
{"handle":"qa-5aa0e5c0986a","displayName":"QA 5aa0e5c0986a","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1ea23cb-9dd9-4fb3-9ddb-9dd25d310e92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-5aa0e5c0986a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_86ce616a-e2b3-476e-b752-a8ba1f928e0f","handle":"qa-5aa0e5c0986a","displayName":"QA 5aa0e5c0986a","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.425622461Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-16398d00-b7db-46e9-ad6f-708df801857f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16398d00-b7db-46e9-ad6f-708df801857f
Content-Type: application/json

--- request body ---
{"handle":"qa-dabeae9788c2","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-16398d00-b7db-46e9-ad6f-708df801857f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b12b2f27-3341-473b-bad0-b5aa18b8f244"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c6975547-07f6-42d3-b05a-1098832434fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6975547-07f6-42d3-b05a-1098832434fa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5aa0e5c0986a","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6975547-07f6-42d3-b05a-1098832434fa
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
Location: /v1/conversations/cnv_bcdbc26d-a2fe-4666-b2a2-aee42bf38983
X-Data-Region: eu
Content-Length: 234

{"id":"cnv_bcdbc26d-a2fe-4666-b2a2-aee42bf38983","subject":"Error contract","status":"open","region":"eu","participants":["qa-dabeae9788c2","qa-5aa0e5c0986a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.467970Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-710f0b40-3d7a-441d-9a68-3e5f7d7e6422

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 240fd7a5-94bf-404c-b681-539a09173bee
X-Correlation-Id: qa-710f0b40-3d7a-441d-9a68-3e5f7d7e6422
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-710f0b40-3d7a-441d-9a68-3e5f7d7e6422
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-710f0b40-3d7a-441d-9a68-3e5f7d7e6422"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0c471599-d76e-44e5-9a30-cd2b0d45bcf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c471599-d76e-44e5-9a30-cd2b0d45bcf0
Content-Type: application/json

--- request body ---
{"handle":"qa-5aa0e5c0986a","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c471599-d76e-44e5-9a30-cd2b0d45bcf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86ce616a-e2b3-476e-b752-a8ba1f928e0f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f59effe0-cbd2-4ead-a00a-ac64174177e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f59effe0-cbd2-4ead-a00a-ac64174177e8
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f59effe0-cbd2-4ead-a00a-ac64174177e8
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
correlation: qa-6c7253e6-1b00-40eb-bb5a-ce896b071eff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c7253e6-1b00-40eb-bb5a-ce896b071eff
Content-Type: application/json

--- request body ---
{"handle":"qa-5aa0e5c0986a","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c7253e6-1b00-40eb-bb5a-ce896b071eff
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c7253e6-1b00-40eb-bb5a-ce896b071eff"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-358357fb-cfa8-48f6-abfd-0ce71ae2c39b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-358357fb-cfa8-48f6-abfd-0ce71ae2c39b
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-358357fb-cfa8-48f6-abfd-0ce71ae2c39b
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
correlation: qa-09fe49ad-aebd-4415-9449-b6905aa09709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09fe49ad-aebd-4415-9449-b6905aa09709
Content-Type: application/json

--- request body ---
{"handle":"qa-dabeae9788c2","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09fe49ad-aebd-4415-9449-b6905aa09709
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09fe49ad-aebd-4415-9449-b6905aa09709"}
```
