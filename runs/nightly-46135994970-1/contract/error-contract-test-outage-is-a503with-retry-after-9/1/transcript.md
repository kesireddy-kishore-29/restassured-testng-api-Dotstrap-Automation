# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-73cc6226-105b-4642-af00-7bfd77bf4927` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-30e297ed-ca27-4c24-b375-6933085d6205` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-a915265e-73ac-4719-818b-ca2c5f73d48d` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-c7118bba-25f1-4fd5-a98c-000f1dfd648f` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 28 | `qa-c8866ba7-d986-421f-a416-c26ca709636c` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-c7f31030-00c8-4917-a404-69f98314a5df` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8f9c257e-4f36-486f-a980-2abb4d944f60` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-f2238713-5f12-4405-b0bd-33cd2d003f5d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-008ba0b8-1224-46d0-a850-ecdb02c1023c` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-905bfe16-f437-4855-8787-95edc0350b82` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73cc6226-105b-4642-af00-7bfd77bf4927

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73cc6226-105b-4642-af00-7bfd77bf4927
Content-Type: application/json

--- request body ---
{"handle":"qa-bbdd92dc63bb","displayName":"QA bbdd92dc63bb","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-73cc6226-105b-4642-af00-7bfd77bf4927
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Location: /v1/accounts/qa-bbdd92dc63bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e667c0c3-fa6a-4cda-87d7-dd38a9417569","handle":"qa-bbdd92dc63bb","displayName":"QA bbdd92dc63bb","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.748361574Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-30e297ed-ca27-4c24-b375-6933085d6205

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30e297ed-ca27-4c24-b375-6933085d6205
Content-Type: application/json

--- request body ---
{"handle":"qa-36b67ac6f1bc","displayName":"QA 36b67ac6f1bc","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-30e297ed-ca27-4c24-b375-6933085d6205
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Location: /v1/accounts/qa-36b67ac6f1bc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db6f4602-4f9b-4271-baa6-ddc040ee50f8","handle":"qa-36b67ac6f1bc","displayName":"QA 36b67ac6f1bc","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.800413740Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a915265e-73ac-4719-818b-ca2c5f73d48d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a915265e-73ac-4719-818b-ca2c5f73d48d
Content-Type: application/json

--- request body ---
{"handle":"qa-bbdd92dc63bb","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a915265e-73ac-4719-818b-ca2c5f73d48d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e667c0c3-fa6a-4cda-87d7-dd38a9417569"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c7118bba-25f1-4fd5-a98c-000f1dfd648f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7118bba-25f1-4fd5-a98c-000f1dfd648f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-36b67ac6f1bc","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7118bba-25f1-4fd5-a98c-000f1dfd648f
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
Location: /v1/conversations/cnv_58f4e6df-dca7-4e45-83b4-d24802ce6b6b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_58f4e6df-dca7-4e45-83b4-d24802ce6b6b","subject":"Error contract","status":"open","region":"eu","participants":["qa-bbdd92dc63bb","qa-36b67ac6f1bc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.876118764Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_58f4e6df-dca7-4e45-83b4-d24802ce6b6b/messages
correlation: qa-c8866ba7-d986-421f-a416-c26ca709636c

--- request headers ---
Accept: application/json
X-Fault-Key: ed46dc0e-d329-42c1-a721-ea3a3facae9f
X-Fault: unavailable-once
X-Correlation-Id: qa-c8866ba7-d986-421f-a416-c26ca709636c
Content-Type: application/json

--- response: 503 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8866ba7-d986-421f-a416-c26ca709636c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_58f4e6df-dca7-4e45-83b4-d24802ce6b6b/messages","correlationId":"qa-c8866ba7-d986-421f-a416-c26ca709636c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c7f31030-00c8-4917-a404-69f98314a5df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7f31030-00c8-4917-a404-69f98314a5df
Content-Type: application/json

--- request body ---
{"handle":"qa-36b67ac6f1bc","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7f31030-00c8-4917-a404-69f98314a5df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db6f4602-4f9b-4271-baa6-ddc040ee50f8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f9c257e-4f36-486f-a980-2abb4d944f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f9c257e-4f36-486f-a980-2abb4d944f60
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f9c257e-4f36-486f-a980-2abb4d944f60
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
correlation: qa-f2238713-5f12-4405-b0bd-33cd2d003f5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2238713-5f12-4405-b0bd-33cd2d003f5d
Content-Type: application/json

--- request body ---
{"handle":"qa-36b67ac6f1bc","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2238713-5f12-4405-b0bd-33cd2d003f5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2238713-5f12-4405-b0bd-33cd2d003f5d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-008ba0b8-1224-46d0-a850-ecdb02c1023c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-008ba0b8-1224-46d0-a850-ecdb02c1023c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-008ba0b8-1224-46d0-a850-ecdb02c1023c
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
correlation: qa-905bfe16-f437-4855-8787-95edc0350b82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-905bfe16-f437-4855-8787-95edc0350b82
Content-Type: application/json

--- request body ---
{"handle":"qa-bbdd92dc63bb","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-905bfe16-f437-4855-8787-95edc0350b82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-905bfe16-f437-4855-8787-95edc0350b82"}
```
