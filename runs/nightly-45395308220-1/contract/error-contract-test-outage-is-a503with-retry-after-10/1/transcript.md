# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 64 | `qa-d1f68294-da79-4f8f-8ba3-fca231a70226` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-d02e7fa7-d4eb-482f-8220-8455ec7f0cba` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-3da72b75-17a5-4c03-aaf6-c788a946f16d` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-ac0e385e-ef26-48c1-ba3c-cd3ef5cf06c5` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 10 | `qa-f0c2efa8-0ab4-44ac-aa0f-d7885689d792` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-15ce366b-8952-4f8c-944f-20ad7445ad4f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-cd5435cf-f620-463f-8bc7-e762b1caa517` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-780b6d7c-de30-4982-b37a-6a0bc7a8aa32` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-47257cda-b261-482d-bef0-f6ea16bcf496` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-ce29c9be-b2ec-4fb3-afb1-411f9e826137` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d1f68294-da79-4f8f-8ba3-fca231a70226

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1f68294-da79-4f8f-8ba3-fca231a70226
Content-Type: application/json

--- request body ---
{"handle":"qa-a219f7534db9","displayName":"QA a219f7534db9","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1f68294-da79-4f8f-8ba3-fca231a70226
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-a219f7534db9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8e9ed5d-3d46-492c-9873-5298e7e6ad00","handle":"qa-a219f7534db9","displayName":"QA a219f7534db9","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.042846926Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d02e7fa7-d4eb-482f-8220-8455ec7f0cba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d02e7fa7-d4eb-482f-8220-8455ec7f0cba
Content-Type: application/json

--- request body ---
{"handle":"qa-8248e628d0ad","displayName":"QA 8248e628d0ad","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d02e7fa7-d4eb-482f-8220-8455ec7f0cba
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
Location: /v1/accounts/qa-8248e628d0ad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3c7362e4-dd2a-4d1f-8ffb-aa06b3c01993","handle":"qa-8248e628d0ad","displayName":"QA 8248e628d0ad","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.131141287Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3da72b75-17a5-4c03-aaf6-c788a946f16d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3da72b75-17a5-4c03-aaf6-c788a946f16d
Content-Type: application/json

--- request body ---
{"handle":"qa-a219f7534db9","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3da72b75-17a5-4c03-aaf6-c788a946f16d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8e9ed5d-3d46-492c-9873-5298e7e6ad00"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ac0e385e-ef26-48c1-ba3c-cd3ef5cf06c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac0e385e-ef26-48c1-ba3c-cd3ef5cf06c5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8248e628d0ad","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac0e385e-ef26-48c1-ba3c-cd3ef5cf06c5
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
Location: /v1/conversations/cnv_f0e77090-0617-407c-b095-9fd2c20ad0dc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f0e77090-0617-407c-b095-9fd2c20ad0dc","subject":"Error contract","status":"open","region":"eu","participants":["qa-a219f7534db9","qa-8248e628d0ad"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.201697055Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f0e77090-0617-407c-b095-9fd2c20ad0dc/messages
correlation: qa-f0c2efa8-0ab4-44ac-aa0f-d7885689d792

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f8aaa5dc-063f-4211-96e6-9cb65fc83409
X-Correlation-Id: qa-f0c2efa8-0ab4-44ac-aa0f-d7885689d792
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0c2efa8-0ab4-44ac-aa0f-d7885689d792
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_f0e77090-0617-407c-b095-9fd2c20ad0dc/messages","correlationId":"qa-f0c2efa8-0ab4-44ac-aa0f-d7885689d792"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-15ce366b-8952-4f8c-944f-20ad7445ad4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ce366b-8952-4f8c-944f-20ad7445ad4f
Content-Type: application/json

--- request body ---
{"handle":"qa-8248e628d0ad","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-15ce366b-8952-4f8c-944f-20ad7445ad4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3c7362e4-dd2a-4d1f-8ffb-aa06b3c01993"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd5435cf-f620-463f-8bc7-e762b1caa517

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd5435cf-f620-463f-8bc7-e762b1caa517
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd5435cf-f620-463f-8bc7-e762b1caa517
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
correlation: qa-780b6d7c-de30-4982-b37a-6a0bc7a8aa32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-780b6d7c-de30-4982-b37a-6a0bc7a8aa32
Content-Type: application/json

--- request body ---
{"handle":"qa-8248e628d0ad","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-780b6d7c-de30-4982-b37a-6a0bc7a8aa32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-780b6d7c-de30-4982-b37a-6a0bc7a8aa32"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-47257cda-b261-482d-bef0-f6ea16bcf496

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47257cda-b261-482d-bef0-f6ea16bcf496
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-47257cda-b261-482d-bef0-f6ea16bcf496
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
correlation: qa-ce29c9be-b2ec-4fb3-afb1-411f9e826137

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce29c9be-b2ec-4fb3-afb1-411f9e826137
Content-Type: application/json

--- request body ---
{"handle":"qa-a219f7534db9","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce29c9be-b2ec-4fb3-afb1-411f9e826137
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce29c9be-b2ec-4fb3-afb1-411f9e826137"}
```
