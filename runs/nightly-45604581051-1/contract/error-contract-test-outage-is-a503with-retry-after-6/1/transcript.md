# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-63915bcd-5778-4b2a-881b-e923f77ff14a` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-dc5b1e4b-8ac3-4437-902c-87e2aa9eb79f` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-6140e177-402d-470f-b9ca-4fb44fdd7c08` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-3bf80577-f422-4a34-b22a-44fe76416504` |
| 5 | `POST /v1/conversations` | 503 | 14 | `qa-42563ec7-d15b-4b18-95b6-10721b5e820a` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-57c91718-e008-49b3-9528-a8e7feb5f04d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-4c0ae5cb-d062-4ad4-aa83-4a77b365cd8b` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-c31b5b36-dc55-4a15-b35f-0f45bb78704e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-ea847152-9350-47c4-bc8a-ff37945b9168` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-57a668c5-17c3-4bc3-b471-dde284f14c1e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-63915bcd-5778-4b2a-881b-e923f77ff14a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63915bcd-5778-4b2a-881b-e923f77ff14a
Content-Type: application/json

--- request body ---
{"handle":"qa-c88353c1a88e","displayName":"QA c88353c1a88e","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-63915bcd-5778-4b2a-881b-e923f77ff14a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-c88353c1a88e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f86b2e3-eb34-4116-9970-54ee3e80f76d","handle":"qa-c88353c1a88e","displayName":"QA c88353c1a88e","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.465701571Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dc5b1e4b-8ac3-4437-902c-87e2aa9eb79f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc5b1e4b-8ac3-4437-902c-87e2aa9eb79f
Content-Type: application/json

--- request body ---
{"handle":"qa-3343483fdcb0","displayName":"QA 3343483fdcb0","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc5b1e4b-8ac3-4437-902c-87e2aa9eb79f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-3343483fdcb0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd9b54ad-c6e4-4af5-98eb-820b144ba263","handle":"qa-3343483fdcb0","displayName":"QA 3343483fdcb0","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.522439986Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6140e177-402d-470f-b9ca-4fb44fdd7c08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6140e177-402d-470f-b9ca-4fb44fdd7c08
Content-Type: application/json

--- request body ---
{"handle":"qa-c88353c1a88e","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6140e177-402d-470f-b9ca-4fb44fdd7c08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f86b2e3-eb34-4116-9970-54ee3e80f76d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3bf80577-f422-4a34-b22a-44fe76416504

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bf80577-f422-4a34-b22a-44fe76416504
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3343483fdcb0","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bf80577-f422-4a34-b22a-44fe76416504
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
Location: /v1/conversations/cnv_222dfa86-3b2e-483f-b18f-b0313c1a1ecc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_222dfa86-3b2e-483f-b18f-b0313c1a1ecc","subject":"Error contract","status":"open","region":"eu","participants":["qa-c88353c1a88e","qa-3343483fdcb0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.590382032Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-42563ec7-d15b-4b18-95b6-10721b5e820a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 48ba1c78-06e7-4ff1-b712-2f789fbea0fe
X-Correlation-Id: qa-42563ec7-d15b-4b18-95b6-10721b5e820a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c88353c1a88e","subject":"Probe","message":"Hi"}

--- response: 503 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42563ec7-d15b-4b18-95b6-10721b5e820a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-42563ec7-d15b-4b18-95b6-10721b5e820a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-57c91718-e008-49b3-9528-a8e7feb5f04d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57c91718-e008-49b3-9528-a8e7feb5f04d
Content-Type: application/json

--- request body ---
{"handle":"qa-3343483fdcb0","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-57c91718-e008-49b3-9528-a8e7feb5f04d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd9b54ad-c6e4-4af5-98eb-820b144ba263"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c0ae5cb-d062-4ad4-aa83-4a77b365cd8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c0ae5cb-d062-4ad4-aa83-4a77b365cd8b
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c0ae5cb-d062-4ad4-aa83-4a77b365cd8b
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
correlation: qa-c31b5b36-dc55-4a15-b35f-0f45bb78704e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c31b5b36-dc55-4a15-b35f-0f45bb78704e
Content-Type: application/json

--- request body ---
{"handle":"qa-3343483fdcb0","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c31b5b36-dc55-4a15-b35f-0f45bb78704e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c31b5b36-dc55-4a15-b35f-0f45bb78704e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea847152-9350-47c4-bc8a-ff37945b9168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea847152-9350-47c4-bc8a-ff37945b9168
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea847152-9350-47c4-bc8a-ff37945b9168
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
correlation: qa-57a668c5-17c3-4bc3-b471-dde284f14c1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57a668c5-17c3-4bc3-b471-dde284f14c1e
Content-Type: application/json

--- request body ---
{"handle":"qa-c88353c1a88e","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57a668c5-17c3-4bc3-b471-dde284f14c1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57a668c5-17c3-4bc3-b471-dde284f14c1e"}
```
