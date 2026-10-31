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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-b5188d53-afa3-46fc-bb14-78bb6bbb90fa` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-c53e3875-2fdb-4610-85a0-924dfbc20f39` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-69398423-ac76-489a-9d99-9c6c4e8e98a2` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-3c7b3348-b31a-42af-90ba-12b7a40534ca` |
| 5 | `POST /v1/credits/purchases` | 503 | 7 | `qa-cc341856-980f-4a1a-86d4-02ad28e9b84f` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-edfb1c34-ba1c-496a-99e3-44455564b61e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f685f7d9-ff08-4fd1-9759-f572d3d7a366` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-13b345d4-b4eb-4b7c-9859-576f311ddbe7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ca97eb40-80c0-4e46-9a3b-5ef01046a2e7` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-b416c64c-d39a-467a-a924-5dba25388620` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b5188d53-afa3-46fc-bb14-78bb6bbb90fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5188d53-afa3-46fc-bb14-78bb6bbb90fa
Content-Type: application/json

--- request body ---
{"handle":"qa-ca06dd4d27e5","displayName":"QA ca06dd4d27e5","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5188d53-afa3-46fc-bb14-78bb6bbb90fa
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
Location: /v1/accounts/qa-ca06dd4d27e5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e02bcf59-0fed-4b55-9948-e58fa100ffe5","handle":"qa-ca06dd4d27e5","displayName":"QA ca06dd4d27e5","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.484524398Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c53e3875-2fdb-4610-85a0-924dfbc20f39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c53e3875-2fdb-4610-85a0-924dfbc20f39
Content-Type: application/json

--- request body ---
{"handle":"qa-8840ae05dabf","displayName":"QA 8840ae05dabf","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-c53e3875-2fdb-4610-85a0-924dfbc20f39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Location: /v1/accounts/qa-8840ae05dabf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fe1e1759-3570-4be8-90a4-b2b65592cbae","handle":"qa-8840ae05dabf","displayName":"QA 8840ae05dabf","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.535899036Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-69398423-ac76-489a-9d99-9c6c4e8e98a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69398423-ac76-489a-9d99-9c6c4e8e98a2
Content-Type: application/json

--- request body ---
{"handle":"qa-ca06dd4d27e5","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-69398423-ac76-489a-9d99-9c6c4e8e98a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e02bcf59-0fed-4b55-9948-e58fa100ffe5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3c7b3348-b31a-42af-90ba-12b7a40534ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c7b3348-b31a-42af-90ba-12b7a40534ca
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8840ae05dabf","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c7b3348-b31a-42af-90ba-12b7a40534ca
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
Location: /v1/conversations/cnv_8f59985f-225c-4b93-981a-dc0a6ed8cafc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8f59985f-225c-4b93-981a-dc0a6ed8cafc","subject":"Error contract","status":"open","region":"eu","participants":["qa-ca06dd4d27e5","qa-8840ae05dabf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.614259677Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cc341856-980f-4a1a-86d4-02ad28e9b84f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ddc8f26830c64bd883ab781795b39923
X-Fault-Key: f9ac42a1-23c7-4ea2-9e06-781f1409db96
X-Fault: unavailable-once
X-Correlation-Id: qa-cc341856-980f-4a1a-86d4-02ad28e9b84f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc341856-980f-4a1a-86d4-02ad28e9b84f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-cc341856-980f-4a1a-86d4-02ad28e9b84f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-edfb1c34-ba1c-496a-99e3-44455564b61e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edfb1c34-ba1c-496a-99e3-44455564b61e
Content-Type: application/json

--- request body ---
{"handle":"qa-8840ae05dabf","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-edfb1c34-ba1c-496a-99e3-44455564b61e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe1e1759-3570-4be8-90a4-b2b65592cbae"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f685f7d9-ff08-4fd1-9759-f572d3d7a366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f685f7d9-ff08-4fd1-9759-f572d3d7a366
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f685f7d9-ff08-4fd1-9759-f572d3d7a366
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
correlation: qa-13b345d4-b4eb-4b7c-9859-576f311ddbe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b345d4-b4eb-4b7c-9859-576f311ddbe7
Content-Type: application/json

--- request body ---
{"handle":"qa-8840ae05dabf","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13b345d4-b4eb-4b7c-9859-576f311ddbe7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-13b345d4-b4eb-4b7c-9859-576f311ddbe7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca97eb40-80c0-4e46-9a3b-5ef01046a2e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca97eb40-80c0-4e46-9a3b-5ef01046a2e7
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca97eb40-80c0-4e46-9a3b-5ef01046a2e7
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
correlation: qa-b416c64c-d39a-467a-a924-5dba25388620

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b416c64c-d39a-467a-a924-5dba25388620
Content-Type: application/json

--- request body ---
{"handle":"qa-ca06dd4d27e5","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b416c64c-d39a-467a-a924-5dba25388620
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b416c64c-d39a-467a-a924-5dba25388620"}
```
