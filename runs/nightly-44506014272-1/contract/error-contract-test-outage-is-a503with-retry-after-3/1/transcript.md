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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-df0936fc-4216-41e7-a5e2-ff02de756f60` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-a8399a30-2a04-4148-aec6-1ffca5744fe9` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-34827ab5-1389-4793-b289-cfa57b4cd25c` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-8f2513a7-4f7e-4c1e-bec7-8752b631f8c1` |
| 5 | `PATCH /v1/accounts/me` | 503 | 32 | `qa-84b02935-3b31-4067-aec7-a50cf677f389` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-2c11b41a-b552-45d1-b44f-44a20583fbbd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-91db2eee-8772-4dba-a01d-9ece462f4b6e` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-49280c77-2e0f-419a-930b-14affe14e751` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-3d139b67-1c02-400c-8fd1-21b4305a18fd` |
| 10 | `POST /v1/auth/token` | 401 | 43 | `qa-70605ceb-7e51-48f3-aa10-6afb75cede55` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-df0936fc-4216-41e7-a5e2-ff02de756f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df0936fc-4216-41e7-a5e2-ff02de756f60
Content-Type: application/json

--- request body ---
{"handle":"qa-444dff350739","displayName":"QA 444dff350739","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-df0936fc-4216-41e7-a5e2-ff02de756f60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-444dff350739
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b2a20133-0aaa-4e81-b6bb-33bbc869f49e","handle":"qa-444dff350739","displayName":"QA 444dff350739","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.524564133Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a8399a30-2a04-4148-aec6-1ffca5744fe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8399a30-2a04-4148-aec6-1ffca5744fe9
Content-Type: application/json

--- request body ---
{"handle":"qa-5326e4b19340","displayName":"QA 5326e4b19340","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8399a30-2a04-4148-aec6-1ffca5744fe9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-5326e4b19340
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d1c23d1f-9c14-40d1-8150-ce40763a8f29","handle":"qa-5326e4b19340","displayName":"QA 5326e4b19340","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.583204584Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-34827ab5-1389-4793-b289-cfa57b4cd25c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34827ab5-1389-4793-b289-cfa57b4cd25c
Content-Type: application/json

--- request body ---
{"handle":"qa-444dff350739","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-34827ab5-1389-4793-b289-cfa57b4cd25c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b2a20133-0aaa-4e81-b6bb-33bbc869f49e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8f2513a7-4f7e-4c1e-bec7-8752b631f8c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2513a7-4f7e-4c1e-bec7-8752b631f8c1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5326e4b19340","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f2513a7-4f7e-4c1e-bec7-8752b631f8c1
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
Location: /v1/conversations/cnv_a0ace932-ccd0-4238-9284-e844349a8835
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a0ace932-ccd0-4238-9284-e844349a8835","subject":"Error contract","status":"open","region":"eu","participants":["qa-444dff350739","qa-5326e4b19340"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.687303612Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-84b02935-3b31-4067-aec7-a50cf677f389

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7739a698-def2-4f4c-8da7-4ab13c75ef90
X-Correlation-Id: qa-84b02935-3b31-4067-aec7-a50cf677f389
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84b02935-3b31-4067-aec7-a50cf677f389
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-84b02935-3b31-4067-aec7-a50cf677f389"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2c11b41a-b552-45d1-b44f-44a20583fbbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c11b41a-b552-45d1-b44f-44a20583fbbd
Content-Type: application/json

--- request body ---
{"handle":"qa-5326e4b19340","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c11b41a-b552-45d1-b44f-44a20583fbbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d1c23d1f-9c14-40d1-8150-ce40763a8f29"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91db2eee-8772-4dba-a01d-9ece462f4b6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91db2eee-8772-4dba-a01d-9ece462f4b6e
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91db2eee-8772-4dba-a01d-9ece462f4b6e
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
correlation: qa-49280c77-2e0f-419a-930b-14affe14e751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49280c77-2e0f-419a-930b-14affe14e751
Content-Type: application/json

--- request body ---
{"handle":"qa-5326e4b19340","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49280c77-2e0f-419a-930b-14affe14e751
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-49280c77-2e0f-419a-930b-14affe14e751"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d139b67-1c02-400c-8fd1-21b4305a18fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d139b67-1c02-400c-8fd1-21b4305a18fd
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d139b67-1c02-400c-8fd1-21b4305a18fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-70605ceb-7e51-48f3-aa10-6afb75cede55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70605ceb-7e51-48f3-aa10-6afb75cede55
Content-Type: application/json

--- request body ---
{"handle":"qa-444dff350739","password":"****"}

--- response: 401 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70605ceb-7e51-48f3-aa10-6afb75cede55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70605ceb-7e51-48f3-aa10-6afb75cede55"}
```
