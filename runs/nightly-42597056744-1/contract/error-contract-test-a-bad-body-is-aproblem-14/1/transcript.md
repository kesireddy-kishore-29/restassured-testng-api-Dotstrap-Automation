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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-6bb118b6-5e80-408c-b620-e61117169988` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-e201de0e-f89b-4905-89f7-4734339bbcea` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-f36e7760-5062-4ae0-9384-5d8d1e174c2c` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-9acbf4bb-e599-4032-bc63-932182f1d97f` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 11 | `qa-fca220d3-72b0-484b-81b0-44cd1e13ba02` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-5e00f3a8-f94e-49df-909c-f19a90fcba13` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-da0e62de-d7cf-4487-afdf-fcc82a0d2872` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-a64d600f-ddb8-49f0-acf2-913702920b0d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-81d859e6-6f1a-441c-a2f5-b167c63c173e` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-b8ebe912-aff4-4b03-994a-1773c3bfb5bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6bb118b6-5e80-408c-b620-e61117169988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bb118b6-5e80-408c-b620-e61117169988
Content-Type: application/json

--- request body ---
{"handle":"qa-6e659f8c857b","displayName":"QA 6e659f8c857b","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bb118b6-5e80-408c-b620-e61117169988
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Location: /v1/accounts/qa-6e659f8c857b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1f6014a6-4243-46ea-8d3a-1a1c870952f8","handle":"qa-6e659f8c857b","displayName":"QA 6e659f8c857b","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.552352179Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e201de0e-f89b-4905-89f7-4734339bbcea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e201de0e-f89b-4905-89f7-4734339bbcea
Content-Type: application/json

--- request body ---
{"handle":"qa-3654640a2b49","displayName":"QA 3654640a2b49","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e201de0e-f89b-4905-89f7-4734339bbcea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Location: /v1/accounts/qa-3654640a2b49
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0768a904-c631-4a3a-b6c8-acb4a30be35a","handle":"qa-3654640a2b49","displayName":"QA 3654640a2b49","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.577819092Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f36e7760-5062-4ae0-9384-5d8d1e174c2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f36e7760-5062-4ae0-9384-5d8d1e174c2c
Content-Type: application/json

--- request body ---
{"handle":"qa-6e659f8c857b","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f36e7760-5062-4ae0-9384-5d8d1e174c2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f6014a6-4243-46ea-8d3a-1a1c870952f8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9acbf4bb-e599-4032-bc63-932182f1d97f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9acbf4bb-e599-4032-bc63-932182f1d97f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3654640a2b49","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9acbf4bb-e599-4032-bc63-932182f1d97f
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
Location: /v1/conversations/cnv_712d095e-f587-4cc9-aab6-49deaeac7ab0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_712d095e-f587-4cc9-aab6-49deaeac7ab0","subject":"Error contract","status":"open","region":"eu","participants":["qa-6e659f8c857b","qa-3654640a2b49"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.648192431Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_712d095e-f587-4cc9-aab6-49deaeac7ab0/messages
correlation: qa-fca220d3-72b0-484b-81b0-44cd1e13ba02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fca220d3-72b0-484b-81b0-44cd1e13ba02
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fca220d3-72b0-484b-81b0-44cd1e13ba02
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_712d095e-f587-4cc9-aab6-49deaeac7ab0/messages","correlationId":"qa-fca220d3-72b0-484b-81b0-44cd1e13ba02","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5e00f3a8-f94e-49df-909c-f19a90fcba13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e00f3a8-f94e-49df-909c-f19a90fcba13
Content-Type: application/json

--- request body ---
{"handle":"qa-3654640a2b49","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e00f3a8-f94e-49df-909c-f19a90fcba13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0768a904-c631-4a3a-b6c8-acb4a30be35a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-da0e62de-d7cf-4487-afdf-fcc82a0d2872

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da0e62de-d7cf-4487-afdf-fcc82a0d2872
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-da0e62de-d7cf-4487-afdf-fcc82a0d2872
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
correlation: qa-a64d600f-ddb8-49f0-acf2-913702920b0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a64d600f-ddb8-49f0-acf2-913702920b0d
Content-Type: application/json

--- request body ---
{"handle":"qa-3654640a2b49","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a64d600f-ddb8-49f0-acf2-913702920b0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a64d600f-ddb8-49f0-acf2-913702920b0d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81d859e6-6f1a-441c-a2f5-b167c63c173e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81d859e6-6f1a-441c-a2f5-b167c63c173e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81d859e6-6f1a-441c-a2f5-b167c63c173e
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
correlation: qa-b8ebe912-aff4-4b03-994a-1773c3bfb5bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8ebe912-aff4-4b03-994a-1773c3bfb5bf
Content-Type: application/json

--- request body ---
{"handle":"qa-6e659f8c857b","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8ebe912-aff4-4b03-994a-1773c3bfb5bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8ebe912-aff4-4b03-994a-1773c3bfb5bf"}
```
