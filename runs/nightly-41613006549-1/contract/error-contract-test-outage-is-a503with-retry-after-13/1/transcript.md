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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-3f53cc39-e505-48e8-9b58-68d11e743e5b` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-e9d36a16-a2b6-4137-8e21-aa7403550f32` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-a8c49556-180a-4b19-9fdf-8c612e37825c` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-4c51b622-b333-4ffa-810b-5f306ca07f30` |
| 5 | `GET /v1/credits/balance` | 503 | 7 | `qa-3915b772-581f-4e2d-a75f-e4046cf11593` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-9358eaca-ea38-486b-9391-3060246f21c7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-9876aebf-ff2c-4756-bc61-b13146c70192` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-1a4ce112-246e-4849-8b5c-e740e296a0a4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-93397daf-540a-440c-a772-7766b9982d96` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-43ea2557-db1b-4caa-ac05-15415026508c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3f53cc39-e505-48e8-9b58-68d11e743e5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f53cc39-e505-48e8-9b58-68d11e743e5b
Content-Type: application/json

--- request body ---
{"handle":"qa-d21f35c9bf28","displayName":"QA d21f35c9bf28","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f53cc39-e505-48e8-9b58-68d11e743e5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Location: /v1/accounts/qa-d21f35c9bf28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8fff5196-2630-4ec4-af4c-b6c567ead7b1","handle":"qa-d21f35c9bf28","displayName":"QA d21f35c9bf28","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.143308869Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e9d36a16-a2b6-4137-8e21-aa7403550f32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9d36a16-a2b6-4137-8e21-aa7403550f32
Content-Type: application/json

--- request body ---
{"handle":"qa-bc09684f9825","displayName":"QA bc09684f9825","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9d36a16-a2b6-4137-8e21-aa7403550f32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Location: /v1/accounts/qa-bc09684f9825
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50e3f06c-0319-4ae1-bc0c-917c95c538fc","handle":"qa-bc09684f9825","displayName":"QA bc09684f9825","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.162300820Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a8c49556-180a-4b19-9fdf-8c612e37825c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8c49556-180a-4b19-9fdf-8c612e37825c
Content-Type: application/json

--- request body ---
{"handle":"qa-d21f35c9bf28","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8c49556-180a-4b19-9fdf-8c612e37825c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8fff5196-2630-4ec4-af4c-b6c567ead7b1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4c51b622-b333-4ffa-810b-5f306ca07f30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c51b622-b333-4ffa-810b-5f306ca07f30
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bc09684f9825","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c51b622-b333-4ffa-810b-5f306ca07f30
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
Location: /v1/conversations/cnv_d70568bc-7fa5-4625-b1f5-2174faabbea1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d70568bc-7fa5-4625-b1f5-2174faabbea1","subject":"Error contract","status":"open","region":"eu","participants":["qa-d21f35c9bf28","qa-bc09684f9825"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.208141839Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-3915b772-581f-4e2d-a75f-e4046cf11593

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 53a13407-6e96-412a-8acd-dff640580615
X-Correlation-Id: qa-3915b772-581f-4e2d-a75f-e4046cf11593
Content-Type: application/json

--- response: 503 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3915b772-581f-4e2d-a75f-e4046cf11593
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-3915b772-581f-4e2d-a75f-e4046cf11593"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9358eaca-ea38-486b-9391-3060246f21c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9358eaca-ea38-486b-9391-3060246f21c7
Content-Type: application/json

--- request body ---
{"handle":"qa-bc09684f9825","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9358eaca-ea38-486b-9391-3060246f21c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50e3f06c-0319-4ae1-bc0c-917c95c538fc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9876aebf-ff2c-4756-bc61-b13146c70192

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9876aebf-ff2c-4756-bc61-b13146c70192
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9876aebf-ff2c-4756-bc61-b13146c70192
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
correlation: qa-1a4ce112-246e-4849-8b5c-e740e296a0a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a4ce112-246e-4849-8b5c-e740e296a0a4
Content-Type: application/json

--- request body ---
{"handle":"qa-bc09684f9825","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a4ce112-246e-4849-8b5c-e740e296a0a4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a4ce112-246e-4849-8b5c-e740e296a0a4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-93397daf-540a-440c-a772-7766b9982d96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93397daf-540a-440c-a772-7766b9982d96
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-93397daf-540a-440c-a772-7766b9982d96
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
correlation: qa-43ea2557-db1b-4caa-ac05-15415026508c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43ea2557-db1b-4caa-ac05-15415026508c
Content-Type: application/json

--- request body ---
{"handle":"qa-d21f35c9bf28","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43ea2557-db1b-4caa-ac05-15415026508c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43ea2557-db1b-4caa-ac05-15415026508c"}
```
