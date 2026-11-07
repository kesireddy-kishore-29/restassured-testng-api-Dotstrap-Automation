# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-c05dc68a-66fc-421f-9a4a-f3d4502bf679` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-11e8819c-b075-4e46-be83-cc2340ecd7dc` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-5544088a-6c2b-429f-a965-3ebaa07685b4` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-c946f0f2-8247-406f-9910-fac8f918bc53` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 2 | `qa-f973d10a-7edf-44be-8d42-b6b3e7784989` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-e2ae68b8-1c3d-43ba-ab39-8d4b246632e7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-391d4723-ae50-45fa-9c9c-c5011fbcf56b` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-cb75bbfe-7ce9-478e-af45-9106cf248c96` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d5831275-42a5-411c-9826-5befdb09871e` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-4501d292-a2cb-4ff2-9ac5-8a70479ecbf2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c05dc68a-66fc-421f-9a4a-f3d4502bf679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c05dc68a-66fc-421f-9a4a-f3d4502bf679
Content-Type: application/json

--- request body ---
{"handle":"qa-c92289c53579","displayName":"QA c92289c53579","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c05dc68a-66fc-421f-9a4a-f3d4502bf679
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Location: /v1/accounts/qa-c92289c53579
X-Served-Region: eu
Content-Length: 181

{"id":"acc_940f9517-a050-48bd-8326-1945b16d08ca","handle":"qa-c92289c53579","displayName":"QA c92289c53579","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.082302164Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-11e8819c-b075-4e46-be83-cc2340ecd7dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11e8819c-b075-4e46-be83-cc2340ecd7dc
Content-Type: application/json

--- request body ---
{"handle":"qa-5289d3b57607","displayName":"QA 5289d3b57607","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-11e8819c-b075-4e46-be83-cc2340ecd7dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Location: /v1/accounts/qa-5289d3b57607
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0ead99e3-d9ce-425d-9380-832597a002d7","handle":"qa-5289d3b57607","displayName":"QA 5289d3b57607","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.139320765Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5544088a-6c2b-429f-a965-3ebaa07685b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5544088a-6c2b-429f-a965-3ebaa07685b4
Content-Type: application/json

--- request body ---
{"handle":"qa-c92289c53579","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5544088a-6c2b-429f-a965-3ebaa07685b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_940f9517-a050-48bd-8326-1945b16d08ca"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c946f0f2-8247-406f-9910-fac8f918bc53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c946f0f2-8247-406f-9910-fac8f918bc53
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5289d3b57607","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c946f0f2-8247-406f-9910-fac8f918bc53
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
Location: /v1/conversations/cnv_cae77eb0-f2f4-4aae-a1b6-91534a39c060
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cae77eb0-f2f4-4aae-a1b6-91534a39c060","subject":"Error contract","status":"open","region":"eu","participants":["qa-c92289c53579","qa-5289d3b57607"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.171005183Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cae77eb0-f2f4-4aae-a1b6-91534a39c060/messages
correlation: qa-f973d10a-7edf-44be-8d42-b6b3e7784989

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f973d10a-7edf-44be-8d42-b6b3e7784989
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 2 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f973d10a-7edf-44be-8d42-b6b3e7784989
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_cae77eb0-f2f4-4aae-a1b6-91534a39c060/messages","correlationId":"qa-f973d10a-7edf-44be-8d42-b6b3e7784989"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e2ae68b8-1c3d-43ba-ab39-8d4b246632e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2ae68b8-1c3d-43ba-ab39-8d4b246632e7
Content-Type: application/json

--- request body ---
{"handle":"qa-5289d3b57607","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2ae68b8-1c3d-43ba-ab39-8d4b246632e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0ead99e3-d9ce-425d-9380-832597a002d7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-391d4723-ae50-45fa-9c9c-c5011fbcf56b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-391d4723-ae50-45fa-9c9c-c5011fbcf56b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-391d4723-ae50-45fa-9c9c-c5011fbcf56b
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
correlation: qa-cb75bbfe-7ce9-478e-af45-9106cf248c96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb75bbfe-7ce9-478e-af45-9106cf248c96
Content-Type: application/json

--- request body ---
{"handle":"qa-5289d3b57607","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb75bbfe-7ce9-478e-af45-9106cf248c96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb75bbfe-7ce9-478e-af45-9106cf248c96"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5831275-42a5-411c-9826-5befdb09871e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5831275-42a5-411c-9826-5befdb09871e
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5831275-42a5-411c-9826-5befdb09871e
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
correlation: qa-4501d292-a2cb-4ff2-9ac5-8a70479ecbf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4501d292-a2cb-4ff2-9ac5-8a70479ecbf2
Content-Type: application/json

--- request body ---
{"handle":"qa-c92289c53579","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4501d292-a2cb-4ff2-9ac5-8a70479ecbf2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4501d292-a2cb-4ff2-9ac5-8a70479ecbf2"}
```
