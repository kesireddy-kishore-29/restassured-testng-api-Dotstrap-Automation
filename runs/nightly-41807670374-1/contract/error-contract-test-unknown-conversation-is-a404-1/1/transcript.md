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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-8f1b5fe9-2ac0-407b-ad72-afea58ba6d83` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-78231ef2-3c7f-452a-b820-6af3f39078e3` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 5 | `qa-28e57c2d-344b-4e5a-bc2d-f2bf70e3a95e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-eb469ce2-8786-4d3c-a835-9c9f8f03767f` |
| 5 | `POST /v1/auth/token` | 401 | 2 | `qa-d80fd427-5d75-49fc-ac69-150936e1d6ae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f1b5fe9-2ac0-407b-ad72-afea58ba6d83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f1b5fe9-2ac0-407b-ad72-afea58ba6d83
Content-Type: application/json

--- request body ---
{"handle":"qa-adf9c70a02df","displayName":"QA adf9c70a02df","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f1b5fe9-2ac0-407b-ad72-afea58ba6d83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 8
Location: /v1/accounts/qa-adf9c70a02df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f3026cf-b4ef-4c82-9ce3-83b3d6871e86","handle":"qa-adf9c70a02df","displayName":"QA adf9c70a02df","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.735040333Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-78231ef2-3c7f-452a-b820-6af3f39078e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78231ef2-3c7f-452a-b820-6af3f39078e3
Content-Type: application/json

--- request body ---
{"handle":"qa-adf9c70a02df","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-78231ef2-3c7f-452a-b820-6af3f39078e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f3026cf-b4ef-4c82-9ce3-83b3d6871e86"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-28e57c2d-344b-4e5a-bc2d-f2bf70e3a95e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28e57c2d-344b-4e5a-bc2d-f2bf70e3a95e
Content-Type: application/json

--- response: 404 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28e57c2d-344b-4e5a-bc2d-f2bf70e3a95e
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-28e57c2d-344b-4e5a-bc2d-f2bf70e3a95e"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb469ce2-8786-4d3c-a835-9c9f8f03767f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb469ce2-8786-4d3c-a835-9c9f8f03767f
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb469ce2-8786-4d3c-a835-9c9f8f03767f
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
correlation: qa-d80fd427-5d75-49fc-ac69-150936e1d6ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d80fd427-5d75-49fc-ac69-150936e1d6ae
Content-Type: application/json

--- request body ---
{"handle":"qa-adf9c70a02df","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d80fd427-5d75-49fc-ac69-150936e1d6ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d80fd427-5d75-49fc-ac69-150936e1d6ae"}
```
