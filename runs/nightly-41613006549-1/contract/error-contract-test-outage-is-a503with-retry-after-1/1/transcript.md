# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 360 | `qa-7762028e-bffb-4445-9e01-462008de4000` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-8dbd68d8-6999-4fbf-a739-7b1c5bf50e0b` |
| 3 | `POST /v1/auth/token` | 200 | 59 | `qa-d9fb25e8-099a-4a25-a75c-e5ac2ffc5636` |
| 4 | `POST /v1/conversations` | 201 | 50 | `qa-ab7fd35f-4910-4ad4-a895-85c4f36b6890` |
| 5 | `POST /v1/accounts` | 503 | 6 | `qa-00cc67c1-a3ba-42b9-8926-628b0423c294` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-464e7e02-d50a-4096-a079-730940ff040e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-19a8bb00-be40-453d-a8b6-ff00038a5bc6` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-7c8a6a20-1dd2-461d-860b-454601fb767b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-7ade0835-6c1f-43d9-9a5f-899cb98d07e9` |
| 10 | `POST /v1/auth/token` | 401 | 46 | `qa-e93f061b-819b-4a74-9a24-3ed0c1223990` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7762028e-bffb-4445-9e01-462008de4000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7762028e-bffb-4445-9e01-462008de4000
Content-Type: application/json

--- request body ---
{"handle":"qa-89d530f564cf","displayName":"QA 89d530f564cf","password":"****","region":"eu"}

--- response: 201 in 360 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7762028e-bffb-4445-9e01-462008de4000
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-89d530f564cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa1dd485-9435-4edc-872d-d12a18d3cde1","handle":"qa-89d530f564cf","displayName":"QA 89d530f564cf","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.875446598Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8dbd68d8-6999-4fbf-a739-7b1c5bf50e0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dbd68d8-6999-4fbf-a739-7b1c5bf50e0b
Content-Type: application/json

--- request body ---
{"handle":"qa-d6fb3484997b","displayName":"QA d6fb3484997b","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dbd68d8-6999-4fbf-a739-7b1c5bf50e0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-d6fb3484997b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a86d74e-c8ef-4593-89d8-78316ea65152","handle":"qa-d6fb3484997b","displayName":"QA d6fb3484997b","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.231359215Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d9fb25e8-099a-4a25-a75c-e5ac2ffc5636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9fb25e8-099a-4a25-a75c-e5ac2ffc5636
Content-Type: application/json

--- request body ---
{"handle":"qa-89d530f564cf","password":"****"}

--- response: 200 in 59 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9fb25e8-099a-4a25-a75c-e5ac2ffc5636
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa1dd485-9435-4edc-872d-d12a18d3cde1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ab7fd35f-4910-4ad4-a895-85c4f36b6890

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab7fd35f-4910-4ad4-a895-85c4f36b6890
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d6fb3484997b","subject":"Error contract","message":"Hi"}

--- response: 201 in 50 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab7fd35f-4910-4ad4-a895-85c4f36b6890
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
Location: /v1/conversations/cnv_f3f0ebec-c10f-4b2c-9851-9a32610ee729
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f3f0ebec-c10f-4b2c-9851-9a32610ee729","subject":"Error contract","status":"open","region":"eu","participants":["qa-89d530f564cf","qa-d6fb3484997b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.401868005Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-00cc67c1-a3ba-42b9-8926-628b0423c294

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c211ef14-7271-4d1a-807f-f289c5c866f6
X-Correlation-Id: qa-00cc67c1-a3ba-42b9-8926-628b0423c294
Content-Type: application/json

--- request body ---
{"handle":"qa-491a2d2310b1","displayName":"QA 491a2d2310b1","password":"****","region":"eu"}

--- response: 503 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00cc67c1-a3ba-42b9-8926-628b0423c294
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-00cc67c1-a3ba-42b9-8926-628b0423c294"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-464e7e02-d50a-4096-a079-730940ff040e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-464e7e02-d50a-4096-a079-730940ff040e
Content-Type: application/json

--- request body ---
{"handle":"qa-d6fb3484997b","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-464e7e02-d50a-4096-a079-730940ff040e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a86d74e-c8ef-4593-89d8-78316ea65152"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19a8bb00-be40-453d-a8b6-ff00038a5bc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a8bb00-be40-453d-a8b6-ff00038a5bc6
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19a8bb00-be40-453d-a8b6-ff00038a5bc6
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
correlation: qa-7c8a6a20-1dd2-461d-860b-454601fb767b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c8a6a20-1dd2-461d-860b-454601fb767b
Content-Type: application/json

--- request body ---
{"handle":"qa-d6fb3484997b","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c8a6a20-1dd2-461d-860b-454601fb767b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c8a6a20-1dd2-461d-860b-454601fb767b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ade0835-6c1f-43d9-9a5f-899cb98d07e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ade0835-6c1f-43d9-9a5f-899cb98d07e9
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ade0835-6c1f-43d9-9a5f-899cb98d07e9
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
correlation: qa-e93f061b-819b-4a74-9a24-3ed0c1223990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e93f061b-819b-4a74-9a24-3ed0c1223990
Content-Type: application/json

--- request body ---
{"handle":"qa-89d530f564cf","password":"****"}

--- response: 401 in 46 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e93f061b-819b-4a74-9a24-3ed0c1223990
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e93f061b-819b-4a74-9a24-3ed0c1223990"}
```
