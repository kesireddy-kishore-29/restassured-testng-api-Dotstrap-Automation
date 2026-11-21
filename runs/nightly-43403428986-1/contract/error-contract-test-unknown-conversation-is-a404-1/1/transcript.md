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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-e0879fba-4707-473f-bb3b-0474a33836cb` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-fa36f766-e3a9-4df7-8a4e-1287b9437b22` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 11 | `qa-4ff9805b-1d9f-4486-ad31-2ea42bc8aa27` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-f77b2b64-afcc-4db5-954f-b59f06841590` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-5a627f0b-cdbc-4390-ae15-9519bf83a09f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e0879fba-4707-473f-bb3b-0474a33836cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0879fba-4707-473f-bb3b-0474a33836cb
Content-Type: application/json

--- request body ---
{"handle":"qa-431d26914042","displayName":"QA 431d26914042","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0879fba-4707-473f-bb3b-0474a33836cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Location: /v1/accounts/qa-431d26914042
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a90ec25b-d6bd-4f49-ad4c-1975b98c057f","handle":"qa-431d26914042","displayName":"QA 431d26914042","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.804355993Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fa36f766-e3a9-4df7-8a4e-1287b9437b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa36f766-e3a9-4df7-8a4e-1287b9437b22
Content-Type: application/json

--- request body ---
{"handle":"qa-431d26914042","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa36f766-e3a9-4df7-8a4e-1287b9437b22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a90ec25b-d6bd-4f49-ad4c-1975b98c057f"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-4ff9805b-1d9f-4486-ad31-2ea42bc8aa27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ff9805b-1d9f-4486-ad31-2ea42bc8aa27
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ff9805b-1d9f-4486-ad31-2ea42bc8aa27
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-4ff9805b-1d9f-4486-ad31-2ea42bc8aa27"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f77b2b64-afcc-4db5-954f-b59f06841590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f77b2b64-afcc-4db5-954f-b59f06841590
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f77b2b64-afcc-4db5-954f-b59f06841590
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
correlation: qa-5a627f0b-cdbc-4390-ae15-9519bf83a09f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a627f0b-cdbc-4390-ae15-9519bf83a09f
Content-Type: application/json

--- request body ---
{"handle":"qa-431d26914042","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a627f0b-cdbc-4390-ae15-9519bf83a09f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a627f0b-cdbc-4390-ae15-9519bf83a09f"}
```
