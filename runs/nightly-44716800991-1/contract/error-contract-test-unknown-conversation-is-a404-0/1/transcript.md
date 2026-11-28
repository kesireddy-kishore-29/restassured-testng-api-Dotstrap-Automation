# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-b6302512-e1ec-4c97-b468-f5edf21efe4d` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-70e7b7f3-1d90-4d3f-ad02-c25827a5ae23` |
| 3 | `GET /v1/conversations/{id}` | 404 | 16 | `qa-576355dd-ac1e-48ac-8c61-d72b80d58ecd` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c3562374-ed07-42b3-ab21-bbcdfd351b7e` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-d4d1a5f6-0c87-4e10-af40-53ee5ba901b7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b6302512-e1ec-4c97-b468-f5edf21efe4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6302512-e1ec-4c97-b468-f5edf21efe4d
Content-Type: application/json

--- request body ---
{"handle":"qa-1cc9f788b136","displayName":"QA 1cc9f788b136","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6302512-e1ec-4c97-b468-f5edf21efe4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Location: /v1/accounts/qa-1cc9f788b136
X-Served-Region: eu
Content-Length: 181

{"id":"acc_077d4b42-4749-46b0-8c44-e8b8de82c3ca","handle":"qa-1cc9f788b136","displayName":"QA 1cc9f788b136","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.172304543Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-70e7b7f3-1d90-4d3f-ad02-c25827a5ae23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70e7b7f3-1d90-4d3f-ad02-c25827a5ae23
Content-Type: application/json

--- request body ---
{"handle":"qa-1cc9f788b136","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-70e7b7f3-1d90-4d3f-ad02-c25827a5ae23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_077d4b42-4749-46b0-8c44-e8b8de82c3ca"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-576355dd-ac1e-48ac-8c61-d72b80d58ecd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-576355dd-ac1e-48ac-8c61-d72b80d58ecd
Content-Type: application/json

--- response: 404 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-576355dd-ac1e-48ac-8c61-d72b80d58ecd
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-576355dd-ac1e-48ac-8c61-d72b80d58ecd"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3562374-ed07-42b3-ab21-bbcdfd351b7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3562374-ed07-42b3-ab21-bbcdfd351b7e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3562374-ed07-42b3-ab21-bbcdfd351b7e
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
correlation: qa-d4d1a5f6-0c87-4e10-af40-53ee5ba901b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4d1a5f6-0c87-4e10-af40-53ee5ba901b7
Content-Type: application/json

--- request body ---
{"handle":"qa-1cc9f788b136","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4d1a5f6-0c87-4e10-af40-53ee5ba901b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4d1a5f6-0c87-4e10-af40-53ee5ba901b7"}
```
