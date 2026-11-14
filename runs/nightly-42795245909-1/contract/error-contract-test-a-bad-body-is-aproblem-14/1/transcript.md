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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-53980833-1dd5-41c7-b735-3abb477d311b` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-19ac6752-2a16-4cfa-9031-2b7d8dc936b3` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-705ac7fd-3e49-4be0-8699-1296f9af4415` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-b839804c-6fcf-495b-ae98-7b9741459699` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 15 | `qa-d27698db-8aaf-4281-9e66-8a1d97f10837` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-9cdb8956-3073-4dd7-88d2-083dc6cc05d7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-d0a3ed79-0b70-4af0-a148-112d79f8498e` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-bebd1f11-b9b1-423b-965d-0ca2733b37d7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-60a62965-a8b7-47b8-9d24-d27c4ad3b86b` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-46e4d372-df84-49d7-9322-757f4675b973` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53980833-1dd5-41c7-b735-3abb477d311b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53980833-1dd5-41c7-b735-3abb477d311b
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b0a39c3366","displayName":"QA b8b0a39c3366","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-53980833-1dd5-41c7-b735-3abb477d311b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-b8b0a39c3366
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d0e8953-da57-4b77-a5e9-3fead0a0a95c","handle":"qa-b8b0a39c3366","displayName":"QA b8b0a39c3366","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.265793692Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-19ac6752-2a16-4cfa-9031-2b7d8dc936b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19ac6752-2a16-4cfa-9031-2b7d8dc936b3
Content-Type: application/json

--- request body ---
{"handle":"qa-5b31b8f4795e","displayName":"QA 5b31b8f4795e","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-19ac6752-2a16-4cfa-9031-2b7d8dc936b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Location: /v1/accounts/qa-5b31b8f4795e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b68e3792-1a41-4248-b85f-bf27196e2ef9","handle":"qa-5b31b8f4795e","displayName":"QA 5b31b8f4795e","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.313038312Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-705ac7fd-3e49-4be0-8699-1296f9af4415

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-705ac7fd-3e49-4be0-8699-1296f9af4415
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b0a39c3366","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-705ac7fd-3e49-4be0-8699-1296f9af4415
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d0e8953-da57-4b77-a5e9-3fead0a0a95c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b839804c-6fcf-495b-ae98-7b9741459699

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b839804c-6fcf-495b-ae98-7b9741459699
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5b31b8f4795e","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b839804c-6fcf-495b-ae98-7b9741459699
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
Location: /v1/conversations/cnv_5bbf6079-9388-4d89-9f37-a7ca08d3a8e1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5bbf6079-9388-4d89-9f37-a7ca08d3a8e1","subject":"Error contract","status":"open","region":"eu","participants":["qa-b8b0a39c3366","qa-5b31b8f4795e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.371968305Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5bbf6079-9388-4d89-9f37-a7ca08d3a8e1/messages
correlation: qa-d27698db-8aaf-4281-9e66-8a1d97f10837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d27698db-8aaf-4281-9e66-8a1d97f10837
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d27698db-8aaf-4281-9e66-8a1d97f10837
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_5bbf6079-9388-4d89-9f37-a7ca08d3a8e1/messages","correlationId":"qa-d27698db-8aaf-4281-9e66-8a1d97f10837","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9cdb8956-3073-4dd7-88d2-083dc6cc05d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cdb8956-3073-4dd7-88d2-083dc6cc05d7
Content-Type: application/json

--- request body ---
{"handle":"qa-5b31b8f4795e","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cdb8956-3073-4dd7-88d2-083dc6cc05d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b68e3792-1a41-4248-b85f-bf27196e2ef9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0a3ed79-0b70-4af0-a148-112d79f8498e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0a3ed79-0b70-4af0-a148-112d79f8498e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0a3ed79-0b70-4af0-a148-112d79f8498e
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
correlation: qa-bebd1f11-b9b1-423b-965d-0ca2733b37d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bebd1f11-b9b1-423b-965d-0ca2733b37d7
Content-Type: application/json

--- request body ---
{"handle":"qa-5b31b8f4795e","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bebd1f11-b9b1-423b-965d-0ca2733b37d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bebd1f11-b9b1-423b-965d-0ca2733b37d7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60a62965-a8b7-47b8-9d24-d27c4ad3b86b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60a62965-a8b7-47b8-9d24-d27c4ad3b86b
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60a62965-a8b7-47b8-9d24-d27c4ad3b86b
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
correlation: qa-46e4d372-df84-49d7-9322-757f4675b973

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46e4d372-df84-49d7-9322-757f4675b973
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b0a39c3366","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46e4d372-df84-49d7-9322-757f4675b973
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46e4d372-df84-49d7-9322-757f4675b973"}
```
