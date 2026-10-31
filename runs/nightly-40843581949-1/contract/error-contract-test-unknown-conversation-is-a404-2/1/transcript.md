# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-f9be9a7d-ff6f-4d3b-bb59-437e8f02fed9` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-31351c2b-e089-48db-b9c4-c2d574f9911b` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 13 | `qa-ae2db24b-8b54-47f4-9951-da0d4a807704` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-3d7f8e96-9aa2-4895-9c18-9996db541dd9` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-1036f75e-a284-4b28-89c7-e3641b36fe41` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f9be9a7d-ff6f-4d3b-bb59-437e8f02fed9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9be9a7d-ff6f-4d3b-bb59-437e8f02fed9
Content-Type: application/json

--- request body ---
{"handle":"qa-9a6397df9c52","displayName":"QA 9a6397df9c52","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9be9a7d-ff6f-4d3b-bb59-437e8f02fed9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Location: /v1/accounts/qa-9a6397df9c52
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c121a76-9edd-489d-acc2-87d0aab854a8","handle":"qa-9a6397df9c52","displayName":"QA 9a6397df9c52","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.777806678Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-31351c2b-e089-48db-b9c4-c2d574f9911b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31351c2b-e089-48db-b9c4-c2d574f9911b
Content-Type: application/json

--- request body ---
{"handle":"qa-9a6397df9c52","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-31351c2b-e089-48db-b9c4-c2d574f9911b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c121a76-9edd-489d-acc2-87d0aab854a8"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-ae2db24b-8b54-47f4-9951-da0d4a807704

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae2db24b-8b54-47f4-9951-da0d4a807704
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae2db24b-8b54-47f4-9951-da0d4a807704
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-ae2db24b-8b54-47f4-9951-da0d4a807704"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d7f8e96-9aa2-4895-9c18-9996db541dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d7f8e96-9aa2-4895-9c18-9996db541dd9
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d7f8e96-9aa2-4895-9c18-9996db541dd9
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
correlation: qa-1036f75e-a284-4b28-89c7-e3641b36fe41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1036f75e-a284-4b28-89c7-e3641b36fe41
Content-Type: application/json

--- request body ---
{"handle":"qa-9a6397df9c52","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1036f75e-a284-4b28-89c7-e3641b36fe41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1036f75e-a284-4b28-89c7-e3641b36fe41"}
```
