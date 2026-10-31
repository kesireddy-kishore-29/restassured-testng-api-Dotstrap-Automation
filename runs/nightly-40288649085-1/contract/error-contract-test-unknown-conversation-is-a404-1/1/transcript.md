# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-cd213525-27e6-44f9-8cfe-12127269c8a2` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-eeb97870-a84a-46ba-9fd7-338771b5c593` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 40 | `qa-aa731628-3461-4100-9194-31d6584d45dd` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-f1443570-d913-4ace-92e5-50766b4e6312` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-17dcec3b-e661-4728-94b6-ea3a03a63077` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd213525-27e6-44f9-8cfe-12127269c8a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd213525-27e6-44f9-8cfe-12127269c8a2
Content-Type: application/json

--- request body ---
{"handle":"qa-82a08c18f6a6","displayName":"QA 82a08c18f6a6","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd213525-27e6-44f9-8cfe-12127269c8a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Location: /v1/accounts/qa-82a08c18f6a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c415ccaf-9f3b-4799-ae53-ec3ad036b4c9","handle":"qa-82a08c18f6a6","displayName":"QA 82a08c18f6a6","region":"eu","role":"user","createdAt":"2026-10-26T07:54:49.122355760Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-eeb97870-a84a-46ba-9fd7-338771b5c593

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeb97870-a84a-46ba-9fd7-338771b5c593
Content-Type: application/json

--- request body ---
{"handle":"qa-82a08c18f6a6","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeb97870-a84a-46ba-9fd7-338771b5c593
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c415ccaf-9f3b-4799-ae53-ec3ad036b4c9"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-aa731628-3461-4100-9194-31d6584d45dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa731628-3461-4100-9194-31d6584d45dd
Content-Type: application/json

--- response: 404 in 40 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa731628-3461-4100-9194-31d6584d45dd
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-aa731628-3461-4100-9194-31d6584d45dd"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1443570-d913-4ace-92e5-50766b4e6312

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1443570-d913-4ace-92e5-50766b4e6312
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1443570-d913-4ace-92e5-50766b4e6312
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-17dcec3b-e661-4728-94b6-ea3a03a63077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17dcec3b-e661-4728-94b6-ea3a03a63077
Content-Type: application/json

--- request body ---
{"handle":"qa-82a08c18f6a6","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17dcec3b-e661-4728-94b6-ea3a03a63077
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-17dcec3b-e661-4728-94b6-ea3a03a63077"}
```
