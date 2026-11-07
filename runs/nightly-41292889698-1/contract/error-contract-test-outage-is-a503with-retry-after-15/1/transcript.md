# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-29024c0d-67e4-404c-be2b-a0940c119296` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-600908fe-1d75-43ba-bafd-590ba58b0d1b` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-1bc1c956-c193-4fea-a896-21c1ab2c9120` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-5924a415-76fc-4d33-b954-6f6e85922420` |
| 5 | `POST /v1/credits/purchases` | 503 | 49 | `qa-e56e857b-adcd-4978-b0b2-cec9b5b44f48` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-62514684-3319-423d-902e-b73b8900fc57` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-98e7ebe7-174e-4eb8-8280-847e718e46ec` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-4dcbe91f-6dd8-4271-a6e1-47d1c395271d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-0375c6a6-32df-4573-b833-21bf024730e3` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-9946d0b3-3edf-43be-959f-ca35bb97727b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29024c0d-67e4-404c-be2b-a0940c119296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29024c0d-67e4-404c-be2b-a0940c119296
Content-Type: application/json

--- request body ---
{"handle":"qa-ee9a925555b3","displayName":"QA ee9a925555b3","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-29024c0d-67e4-404c-be2b-a0940c119296
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Location: /v1/accounts/qa-ee9a925555b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f479912-15ec-4679-bc70-08a53e16f18a","handle":"qa-ee9a925555b3","displayName":"QA ee9a925555b3","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.629867067Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-600908fe-1d75-43ba-bafd-590ba58b0d1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-600908fe-1d75-43ba-bafd-590ba58b0d1b
Content-Type: application/json

--- request body ---
{"handle":"qa-ab838c61481c","displayName":"QA ab838c61481c","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-600908fe-1d75-43ba-bafd-590ba58b0d1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Location: /v1/accounts/qa-ab838c61481c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d4311a8a-e28f-470e-ab84-42ed087bddce","handle":"qa-ab838c61481c","displayName":"QA ab838c61481c","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.689761387Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1bc1c956-c193-4fea-a896-21c1ab2c9120

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bc1c956-c193-4fea-a896-21c1ab2c9120
Content-Type: application/json

--- request body ---
{"handle":"qa-ee9a925555b3","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bc1c956-c193-4fea-a896-21c1ab2c9120
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f479912-15ec-4679-bc70-08a53e16f18a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5924a415-76fc-4d33-b954-6f6e85922420

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5924a415-76fc-4d33-b954-6f6e85922420
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ab838c61481c","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5924a415-76fc-4d33-b954-6f6e85922420
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
Location: /v1/conversations/cnv_819da41e-b513-4ed6-9d46-4421c894cb3f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_819da41e-b513-4ed6-9d46-4421c894cb3f","subject":"Error contract","status":"open","region":"eu","participants":["qa-ee9a925555b3","qa-ab838c61481c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.767828363Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e56e857b-adcd-4978-b0b2-cec9b5b44f48

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
Idempotency-Key: qa-62d8be09a3904f65b61319e0052f4573
X-Fault-Key: 74f0a358-bb9a-495a-acdc-6f9cf0c80aeb
X-Correlation-Id: qa-e56e857b-adcd-4978-b0b2-cec9b5b44f48
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 49 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e56e857b-adcd-4978-b0b2-cec9b5b44f48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-e56e857b-adcd-4978-b0b2-cec9b5b44f48"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-62514684-3319-423d-902e-b73b8900fc57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62514684-3319-423d-902e-b73b8900fc57
Content-Type: application/json

--- request body ---
{"handle":"qa-ab838c61481c","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-62514684-3319-423d-902e-b73b8900fc57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d4311a8a-e28f-470e-ab84-42ed087bddce"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98e7ebe7-174e-4eb8-8280-847e718e46ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98e7ebe7-174e-4eb8-8280-847e718e46ec
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98e7ebe7-174e-4eb8-8280-847e718e46ec
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
correlation: qa-4dcbe91f-6dd8-4271-a6e1-47d1c395271d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dcbe91f-6dd8-4271-a6e1-47d1c395271d
Content-Type: application/json

--- request body ---
{"handle":"qa-ab838c61481c","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4dcbe91f-6dd8-4271-a6e1-47d1c395271d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4dcbe91f-6dd8-4271-a6e1-47d1c395271d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0375c6a6-32df-4573-b833-21bf024730e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0375c6a6-32df-4573-b833-21bf024730e3
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0375c6a6-32df-4573-b833-21bf024730e3
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
correlation: qa-9946d0b3-3edf-43be-959f-ca35bb97727b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9946d0b3-3edf-43be-959f-ca35bb97727b
Content-Type: application/json

--- request body ---
{"handle":"qa-ee9a925555b3","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9946d0b3-3edf-43be-959f-ca35bb97727b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9946d0b3-3edf-43be-959f-ca35bb97727b"}
```
