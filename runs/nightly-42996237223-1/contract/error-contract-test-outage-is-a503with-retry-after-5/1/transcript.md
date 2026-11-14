# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-e9b874b3-e928-420c-ab63-9dbe3a892b35` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-9abaf93b-2a5d-4007-80a0-4d7c405c5835` |
| 3 | `POST /v1/auth/token` | 200 | 54 | `qa-d9a02a61-e70a-418c-9974-956f31dba02f` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-0e84a757-dd65-4d79-9162-1976a279733e` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 21 | `qa-355a8bd3-0eb5-4551-9c42-c40e56d1afdb` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-faecc609-d6f2-475c-b5ee-af758d829cd4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-9e047e0f-fb15-4714-99ca-e29bdffa7118` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-e731899a-8f42-40b2-8df1-1c5bb4b3078e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-ca2fae31-98d6-49ba-9d3e-03bf7bc6a44b` |
| 10 | `POST /v1/auth/token` | 401 | 37 | `qa-ac91d4ab-0b52-4c60-9fcf-3783ec533951` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e9b874b3-e928-420c-ab63-9dbe3a892b35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9b874b3-e928-420c-ab63-9dbe3a892b35
Content-Type: application/json

--- request body ---
{"handle":"qa-04a5c5ad1836","displayName":"QA 04a5c5ad1836","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9b874b3-e928-420c-ab63-9dbe3a892b35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Location: /v1/accounts/qa-04a5c5ad1836
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b100971-b909-4db1-9cca-9da56623146b","handle":"qa-04a5c5ad1836","displayName":"QA 04a5c5ad1836","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.622684228Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9abaf93b-2a5d-4007-80a0-4d7c405c5835

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9abaf93b-2a5d-4007-80a0-4d7c405c5835
Content-Type: application/json

--- request body ---
{"handle":"qa-3fb54c26ea16","displayName":"QA 3fb54c26ea16","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9abaf93b-2a5d-4007-80a0-4d7c405c5835
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-3fb54c26ea16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96ff9197-84c8-440d-a0dd-902b72f391cb","handle":"qa-3fb54c26ea16","displayName":"QA 3fb54c26ea16","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.690777285Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d9a02a61-e70a-418c-9974-956f31dba02f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9a02a61-e70a-418c-9974-956f31dba02f
Content-Type: application/json

--- request body ---
{"handle":"qa-04a5c5ad1836","password":"****"}

--- response: 200 in 54 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9a02a61-e70a-418c-9974-956f31dba02f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b100971-b909-4db1-9cca-9da56623146b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0e84a757-dd65-4d79-9162-1976a279733e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e84a757-dd65-4d79-9162-1976a279733e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3fb54c26ea16","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e84a757-dd65-4d79-9162-1976a279733e
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
Location: /v1/conversations/cnv_dfe46412-c6e9-4ca9-a90c-63fe16651916
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dfe46412-c6e9-4ca9-a90c-63fe16651916","subject":"Error contract","status":"open","region":"eu","participants":["qa-04a5c5ad1836","qa-3fb54c26ea16"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:37.829977688Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-04a5c5ad1836
correlation: qa-355a8bd3-0eb5-4551-9c42-c40e56d1afdb

--- request headers ---
Accept: application/json
X-Fault-Key: 056737bf-52ce-4403-8f6d-d2fe2f3b944b
X-Fault: unavailable-once
X-Correlation-Id: qa-355a8bd3-0eb5-4551-9c42-c40e56d1afdb
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-355a8bd3-0eb5-4551-9c42-c40e56d1afdb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-04a5c5ad1836","correlationId":"qa-355a8bd3-0eb5-4551-9c42-c40e56d1afdb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-faecc609-d6f2-475c-b5ee-af758d829cd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faecc609-d6f2-475c-b5ee-af758d829cd4
Content-Type: application/json

--- request body ---
{"handle":"qa-3fb54c26ea16","password":"****"}

--- response: 200 in 48 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-faecc609-d6f2-475c-b5ee-af758d829cd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96ff9197-84c8-440d-a0dd-902b72f391cb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9e047e0f-fb15-4714-99ca-e29bdffa7118

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e047e0f-fb15-4714-99ca-e29bdffa7118
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9e047e0f-fb15-4714-99ca-e29bdffa7118
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
correlation: qa-e731899a-8f42-40b2-8df1-1c5bb4b3078e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e731899a-8f42-40b2-8df1-1c5bb4b3078e
Content-Type: application/json

--- request body ---
{"handle":"qa-3fb54c26ea16","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e731899a-8f42-40b2-8df1-1c5bb4b3078e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e731899a-8f42-40b2-8df1-1c5bb4b3078e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca2fae31-98d6-49ba-9d3e-03bf7bc6a44b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca2fae31-98d6-49ba-9d3e-03bf7bc6a44b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca2fae31-98d6-49ba-9d3e-03bf7bc6a44b
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
correlation: qa-ac91d4ab-0b52-4c60-9fcf-3783ec533951

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac91d4ab-0b52-4c60-9fcf-3783ec533951
Content-Type: application/json

--- request body ---
{"handle":"qa-04a5c5ad1836","password":"****"}

--- response: 401 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac91d4ab-0b52-4c60-9fcf-3783ec533951
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac91d4ab-0b52-4c60-9fcf-3783ec533951"}
```
