# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-097eeee5-67bf-4219-ba8d-6147475237bc` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-4e3d68b9-dc36-4caf-9f5e-914a3fd20afa` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-9840ca6c-7b98-4800-9637-23bdd08db742` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-5dfd3e83-2f3c-4365-9447-8cced1324bdc` |
| 5 | `GET /v1/admin/stats` | 503 | 11 | `qa-0aaba640-b421-4e86-8d38-7b419909f071` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-da5e9740-8550-4779-9032-97088d9c7572` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-67166122-c45c-4a9f-a1e0-1ff908ce7386` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-dbd87e67-cbab-45d2-8ac2-335246066e65` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-19e73acf-9365-475a-8823-ab89acfd13b3` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-9cdff1b0-25fc-408b-b650-5a7f8467a2b9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-097eeee5-67bf-4219-ba8d-6147475237bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-097eeee5-67bf-4219-ba8d-6147475237bc
Content-Type: application/json

--- request body ---
{"handle":"qa-eda6c11f5e52","displayName":"QA eda6c11f5e52","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-097eeee5-67bf-4219-ba8d-6147475237bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Location: /v1/accounts/qa-eda6c11f5e52
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8bdcd3a7-de00-4f32-84dc-2d62a508defd","handle":"qa-eda6c11f5e52","displayName":"QA eda6c11f5e52","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.227180391Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4e3d68b9-dc36-4caf-9f5e-914a3fd20afa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e3d68b9-dc36-4caf-9f5e-914a3fd20afa
Content-Type: application/json

--- request body ---
{"handle":"qa-2bc90cb5178c","displayName":"QA 2bc90cb5178c","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e3d68b9-dc36-4caf-9f5e-914a3fd20afa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Location: /v1/accounts/qa-2bc90cb5178c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b9b252f-8ce0-41cc-a48c-c8bfde04941b","handle":"qa-2bc90cb5178c","displayName":"QA 2bc90cb5178c","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.288159024Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9840ca6c-7b98-4800-9637-23bdd08db742

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9840ca6c-7b98-4800-9637-23bdd08db742
Content-Type: application/json

--- request body ---
{"handle":"qa-eda6c11f5e52","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-9840ca6c-7b98-4800-9637-23bdd08db742
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8bdcd3a7-de00-4f32-84dc-2d62a508defd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5dfd3e83-2f3c-4365-9447-8cced1324bdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dfd3e83-2f3c-4365-9447-8cced1324bdc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2bc90cb5178c","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dfd3e83-2f3c-4365-9447-8cced1324bdc
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
Location: /v1/conversations/cnv_5f72a602-1b40-4039-8e30-c73486458011
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5f72a602-1b40-4039-8e30-c73486458011","subject":"Error contract","status":"open","region":"eu","participants":["qa-eda6c11f5e52","qa-2bc90cb5178c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:47.369940413Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-0aaba640-b421-4e86-8d38-7b419909f071

--- request headers ---
Accept: application/json
X-Fault-Key: 8b3224bb-9026-4ea8-941e-20847adf0ec0
X-Fault: unavailable-once
X-Correlation-Id: qa-0aaba640-b421-4e86-8d38-7b419909f071
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0aaba640-b421-4e86-8d38-7b419909f071
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-0aaba640-b421-4e86-8d38-7b419909f071"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-da5e9740-8550-4779-9032-97088d9c7572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da5e9740-8550-4779-9032-97088d9c7572
Content-Type: application/json

--- request body ---
{"handle":"qa-2bc90cb5178c","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-da5e9740-8550-4779-9032-97088d9c7572
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b9b252f-8ce0-41cc-a48c-c8bfde04941b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-67166122-c45c-4a9f-a1e0-1ff908ce7386

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67166122-c45c-4a9f-a1e0-1ff908ce7386
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-67166122-c45c-4a9f-a1e0-1ff908ce7386
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
correlation: qa-dbd87e67-cbab-45d2-8ac2-335246066e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbd87e67-cbab-45d2-8ac2-335246066e65
Content-Type: application/json

--- request body ---
{"handle":"qa-2bc90cb5178c","password":"****"}

--- response: 401 in 28 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbd87e67-cbab-45d2-8ac2-335246066e65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dbd87e67-cbab-45d2-8ac2-335246066e65"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19e73acf-9365-475a-8823-ab89acfd13b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19e73acf-9365-475a-8823-ab89acfd13b3
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19e73acf-9365-475a-8823-ab89acfd13b3
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
correlation: qa-9cdff1b0-25fc-408b-b650-5a7f8467a2b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cdff1b0-25fc-408b-b650-5a7f8467a2b9
Content-Type: application/json

--- request body ---
{"handle":"qa-eda6c11f5e52","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cdff1b0-25fc-408b-b650-5a7f8467a2b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9cdff1b0-25fc-408b-b650-5a7f8467a2b9"}
```
