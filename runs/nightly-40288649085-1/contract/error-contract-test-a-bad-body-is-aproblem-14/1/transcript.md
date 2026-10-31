# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-7427a368-4e85-4388-b7a5-1cc13218b73a` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-4992c132-3372-49c3-9726-1ff432ebccad` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-d2fac7dc-9317-42b4-8d15-0735c1125672` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-efb6b16b-d568-465f-9624-a53ceaea0e09` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 12 | `qa-197f2efb-0222-44ab-bdbb-7fec7a54346f` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-32d06229-cf1d-4010-aa9d-3d2faf4a9f76` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-1eeb164b-1994-45d6-9ed2-45570f9a6f86` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-999e6eb1-121e-45b6-b14e-971f28ddbce9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0c85ab7c-20f4-46c0-bd15-83d710077d80` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-3d56e70f-da3c-48ef-8870-607d6d79ddb0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7427a368-4e85-4388-b7a5-1cc13218b73a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7427a368-4e85-4388-b7a5-1cc13218b73a
Content-Type: application/json

--- request body ---
{"handle":"qa-f9cf239fcd11","displayName":"QA f9cf239fcd11","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-7427a368-4e85-4388-b7a5-1cc13218b73a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Location: /v1/accounts/qa-f9cf239fcd11
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc69841c-f5f6-4103-bf8e-b5e2cd2ee319","handle":"qa-f9cf239fcd11","displayName":"QA f9cf239fcd11","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.470280556Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4992c132-3372-49c3-9726-1ff432ebccad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4992c132-3372-49c3-9726-1ff432ebccad
Content-Type: application/json

--- request body ---
{"handle":"qa-b90db2320a93","displayName":"QA b90db2320a93","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-4992c132-3372-49c3-9726-1ff432ebccad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-b90db2320a93
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22589aaf-0881-48d1-84d9-4c3fb2f0cca7","handle":"qa-b90db2320a93","displayName":"QA b90db2320a93","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.506202282Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d2fac7dc-9317-42b4-8d15-0735c1125672

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2fac7dc-9317-42b4-8d15-0735c1125672
Content-Type: application/json

--- request body ---
{"handle":"qa-f9cf239fcd11","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2fac7dc-9317-42b4-8d15-0735c1125672
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc69841c-f5f6-4103-bf8e-b5e2cd2ee319"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-efb6b16b-d568-465f-9624-a53ceaea0e09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efb6b16b-d568-465f-9624-a53ceaea0e09
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b90db2320a93","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-efb6b16b-d568-465f-9624-a53ceaea0e09
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
Location: /v1/conversations/cnv_9f513ccf-ed90-4ec8-b5e5-d300f514a589
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9f513ccf-ed90-4ec8-b5e5-d300f514a589","subject":"Error contract","status":"open","region":"eu","participants":["qa-f9cf239fcd11","qa-b90db2320a93"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.567771278Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9f513ccf-ed90-4ec8-b5e5-d300f514a589/messages
correlation: qa-197f2efb-0222-44ab-bdbb-7fec7a54346f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-197f2efb-0222-44ab-bdbb-7fec7a54346f
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-197f2efb-0222-44ab-bdbb-7fec7a54346f
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_9f513ccf-ed90-4ec8-b5e5-d300f514a589/messages","correlationId":"qa-197f2efb-0222-44ab-bdbb-7fec7a54346f","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-32d06229-cf1d-4010-aa9d-3d2faf4a9f76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32d06229-cf1d-4010-aa9d-3d2faf4a9f76
Content-Type: application/json

--- request body ---
{"handle":"qa-b90db2320a93","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-32d06229-cf1d-4010-aa9d-3d2faf4a9f76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22589aaf-0881-48d1-84d9-4c3fb2f0cca7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1eeb164b-1994-45d6-9ed2-45570f9a6f86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eeb164b-1994-45d6-9ed2-45570f9a6f86
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1eeb164b-1994-45d6-9ed2-45570f9a6f86
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
correlation: qa-999e6eb1-121e-45b6-b14e-971f28ddbce9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999e6eb1-121e-45b6-b14e-971f28ddbce9
Content-Type: application/json

--- request body ---
{"handle":"qa-b90db2320a93","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-999e6eb1-121e-45b6-b14e-971f28ddbce9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-999e6eb1-121e-45b6-b14e-971f28ddbce9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c85ab7c-20f4-46c0-bd15-83d710077d80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c85ab7c-20f4-46c0-bd15-83d710077d80
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c85ab7c-20f4-46c0-bd15-83d710077d80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3d56e70f-da3c-48ef-8870-607d6d79ddb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d56e70f-da3c-48ef-8870-607d6d79ddb0
Content-Type: application/json

--- request body ---
{"handle":"qa-f9cf239fcd11","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d56e70f-da3c-48ef-8870-607d6d79ddb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d56e70f-da3c-48ef-8870-607d6d79ddb0"}
```
