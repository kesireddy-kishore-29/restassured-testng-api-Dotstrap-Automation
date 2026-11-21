# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-5ac9d03c-814b-4cd6-acbd-05c0e05cb510` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-07948136-ed53-43ea-acea-02941ec011e4` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-f0da197e-fb9e-4e47-89fa-4d60f9f89819` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-54d42f75-7ae0-43f1-b60a-e9090203cc39` |
| 5 | `PATCH /v1/accounts/me` | 422 | 15 | `qa-1b8716bd-4de2-4a16-b53d-f7ba8c03f6bb` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-5e069edf-04e3-473b-bd2f-a7ccd3e6d236` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7970a42d-4210-44ee-9c11-d05e994aa4eb` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-6874d12a-f94b-4da6-a7d3-0f0a84047794` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-4d0bb236-fcab-4325-a228-b2f08f398428` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-5573831f-4b20-419c-8866-9f7c49454b2c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ac9d03c-814b-4cd6-acbd-05c0e05cb510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ac9d03c-814b-4cd6-acbd-05c0e05cb510
Content-Type: application/json

--- request body ---
{"handle":"qa-9b2dacd8584d","displayName":"QA 9b2dacd8584d","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ac9d03c-814b-4cd6-acbd-05c0e05cb510
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Location: /v1/accounts/qa-9b2dacd8584d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_03c4c08c-72ec-4f40-aad2-69153cfdca4f","handle":"qa-9b2dacd8584d","displayName":"QA 9b2dacd8584d","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.627127378Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-07948136-ed53-43ea-acea-02941ec011e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07948136-ed53-43ea-acea-02941ec011e4
Content-Type: application/json

--- request body ---
{"handle":"qa-8e8d016f54a0","displayName":"QA 8e8d016f54a0","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-07948136-ed53-43ea-acea-02941ec011e4
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
Location: /v1/accounts/qa-8e8d016f54a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_952a3aca-3752-4adf-8193-0f564e70a572","handle":"qa-8e8d016f54a0","displayName":"QA 8e8d016f54a0","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.681234413Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f0da197e-fb9e-4e47-89fa-4d60f9f89819

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0da197e-fb9e-4e47-89fa-4d60f9f89819
Content-Type: application/json

--- request body ---
{"handle":"qa-9b2dacd8584d","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0da197e-fb9e-4e47-89fa-4d60f9f89819
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_03c4c08c-72ec-4f40-aad2-69153cfdca4f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-54d42f75-7ae0-43f1-b60a-e9090203cc39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54d42f75-7ae0-43f1-b60a-e9090203cc39
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8e8d016f54a0","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-54d42f75-7ae0-43f1-b60a-e9090203cc39
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
Location: /v1/conversations/cnv_e1a5d250-de4c-4181-93be-a4d093c3230a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e1a5d250-de4c-4181-93be-a4d093c3230a","subject":"Error contract","status":"open","region":"eu","participants":["qa-9b2dacd8584d","qa-8e8d016f54a0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.763368403Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-1b8716bd-4de2-4a16-b53d-f7ba8c03f6bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b8716bd-4de2-4a16-b53d-f7ba8c03f6bb
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b8716bd-4de2-4a16-b53d-f7ba8c03f6bb
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-1b8716bd-4de2-4a16-b53d-f7ba8c03f6bb","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5e069edf-04e3-473b-bd2f-a7ccd3e6d236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e069edf-04e3-473b-bd2f-a7ccd3e6d236
Content-Type: application/json

--- request body ---
{"handle":"qa-8e8d016f54a0","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e069edf-04e3-473b-bd2f-a7ccd3e6d236
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_952a3aca-3752-4adf-8193-0f564e70a572"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7970a42d-4210-44ee-9c11-d05e994aa4eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7970a42d-4210-44ee-9c11-d05e994aa4eb
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7970a42d-4210-44ee-9c11-d05e994aa4eb
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
correlation: qa-6874d12a-f94b-4da6-a7d3-0f0a84047794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6874d12a-f94b-4da6-a7d3-0f0a84047794
Content-Type: application/json

--- request body ---
{"handle":"qa-8e8d016f54a0","password":"****"}

--- response: 401 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6874d12a-f94b-4da6-a7d3-0f0a84047794
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6874d12a-f94b-4da6-a7d3-0f0a84047794"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d0bb236-fcab-4325-a228-b2f08f398428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d0bb236-fcab-4325-a228-b2f08f398428
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d0bb236-fcab-4325-a228-b2f08f398428
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
correlation: qa-5573831f-4b20-419c-8866-9f7c49454b2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5573831f-4b20-419c-8866-9f7c49454b2c
Content-Type: application/json

--- request body ---
{"handle":"qa-9b2dacd8584d","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5573831f-4b20-419c-8866-9f7c49454b2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5573831f-4b20-419c-8866-9f7c49454b2c"}
```
