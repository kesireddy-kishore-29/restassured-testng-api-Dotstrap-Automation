# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-19591944-147b-4f86-941b-576899df56a6` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-0269974a-bf85-4a04-9fde-277e7b9a7e44` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-e255dc43-f30d-4054-b9e8-8e968f62930a` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-549ba7cd-51ab-4fd0-9296-b98e0ad58f71` |
| 5 | `GET /v1/credits/ledger` | 503 | 16 | `qa-e751dd01-b1ee-4dbe-9e8c-ca743ea00e8f` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-6c6c650b-09d0-4ae5-8a6d-fbf51121cca6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e7b738b3-5d16-4ca6-af9f-9d94536225a7` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-09c614de-c03b-4af6-b67e-37d08e170068` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2d58225f-e658-4648-a691-12111a8d2ad0` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-7caa8f43-d30c-4be7-8721-0649fcd50db6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-19591944-147b-4f86-941b-576899df56a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19591944-147b-4f86-941b-576899df56a6
Content-Type: application/json

--- request body ---
{"handle":"qa-b939276a0696","displayName":"QA b939276a0696","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-19591944-147b-4f86-941b-576899df56a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Location: /v1/accounts/qa-b939276a0696
X-Served-Region: eu
Content-Length: 181

{"id":"acc_be24deee-1db2-4ed5-a5ad-c6282b2a6318","handle":"qa-b939276a0696","displayName":"QA b939276a0696","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.392597057Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0269974a-bf85-4a04-9fde-277e7b9a7e44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0269974a-bf85-4a04-9fde-277e7b9a7e44
Content-Type: application/json

--- request body ---
{"handle":"qa-9a2c7039556e","displayName":"QA 9a2c7039556e","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0269974a-bf85-4a04-9fde-277e7b9a7e44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Location: /v1/accounts/qa-9a2c7039556e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ed5cbab-fed1-4759-a885-0d4536599366","handle":"qa-9a2c7039556e","displayName":"QA 9a2c7039556e","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.442563307Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e255dc43-f30d-4054-b9e8-8e968f62930a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e255dc43-f30d-4054-b9e8-8e968f62930a
Content-Type: application/json

--- request body ---
{"handle":"qa-b939276a0696","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e255dc43-f30d-4054-b9e8-8e968f62930a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be24deee-1db2-4ed5-a5ad-c6282b2a6318"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-549ba7cd-51ab-4fd0-9296-b98e0ad58f71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-549ba7cd-51ab-4fd0-9296-b98e0ad58f71
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9a2c7039556e","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-549ba7cd-51ab-4fd0-9296-b98e0ad58f71
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
Location: /v1/conversations/cnv_ac132e8a-d237-438a-9fe0-01f237e43811
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ac132e8a-d237-438a-9fe0-01f237e43811","subject":"Error contract","status":"open","region":"eu","participants":["qa-b939276a0696","qa-9a2c7039556e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.483745317Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-e751dd01-b1ee-4dbe-9e8c-ca743ea00e8f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 973b2a08-bdf1-4fa2-915d-f4505386ed0c
X-Correlation-Id: qa-e751dd01-b1ee-4dbe-9e8c-ca743ea00e8f
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e751dd01-b1ee-4dbe-9e8c-ca743ea00e8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-e751dd01-b1ee-4dbe-9e8c-ca743ea00e8f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6c6c650b-09d0-4ae5-8a6d-fbf51121cca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c6c650b-09d0-4ae5-8a6d-fbf51121cca6
Content-Type: application/json

--- request body ---
{"handle":"qa-9a2c7039556e","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c6c650b-09d0-4ae5-8a6d-fbf51121cca6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ed5cbab-fed1-4759-a885-0d4536599366"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7b738b3-5d16-4ca6-af9f-9d94536225a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7b738b3-5d16-4ca6-af9f-9d94536225a7
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7b738b3-5d16-4ca6-af9f-9d94536225a7
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
correlation: qa-09c614de-c03b-4af6-b67e-37d08e170068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09c614de-c03b-4af6-b67e-37d08e170068
Content-Type: application/json

--- request body ---
{"handle":"qa-9a2c7039556e","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09c614de-c03b-4af6-b67e-37d08e170068
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09c614de-c03b-4af6-b67e-37d08e170068"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d58225f-e658-4648-a691-12111a8d2ad0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d58225f-e658-4648-a691-12111a8d2ad0
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d58225f-e658-4648-a691-12111a8d2ad0
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
correlation: qa-7caa8f43-d30c-4be7-8721-0649fcd50db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7caa8f43-d30c-4be7-8721-0649fcd50db6
Content-Type: application/json

--- request body ---
{"handle":"qa-b939276a0696","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7caa8f43-d30c-4be7-8721-0649fcd50db6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7caa8f43-d30c-4be7-8721-0649fcd50db6"}
```
