# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-8b898b76-814c-4fc4-b42e-1264f382cbbc` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-4dfd93b5-cfbe-4d31-b4e6-ed6d6a344982` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 14 | `qa-f9fac03a-6a21-4484-aebc-bc0263ece45c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-8aac0f6a-e1e1-405a-bd13-1b9d7ea0050c` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-50b891af-20a0-450b-a578-9f9c865e7d65` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8b898b76-814c-4fc4-b42e-1264f382cbbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b898b76-814c-4fc4-b42e-1264f382cbbc
Content-Type: application/json

--- request body ---
{"handle":"qa-8261d1aaade7","displayName":"QA 8261d1aaade7","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b898b76-814c-4fc4-b42e-1264f382cbbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Location: /v1/accounts/qa-8261d1aaade7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b1b2bd6-2c83-41e7-bee3-ae85d447f835","handle":"qa-8261d1aaade7","displayName":"QA 8261d1aaade7","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.878177795Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4dfd93b5-cfbe-4d31-b4e6-ed6d6a344982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dfd93b5-cfbe-4d31-b4e6-ed6d6a344982
Content-Type: application/json

--- request body ---
{"handle":"qa-8261d1aaade7","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dfd93b5-cfbe-4d31-b4e6-ed6d6a344982
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b1b2bd6-2c83-41e7-bee3-ae85d447f835"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-f9fac03a-6a21-4484-aebc-bc0263ece45c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9fac03a-6a21-4484-aebc-bc0263ece45c
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9fac03a-6a21-4484-aebc-bc0263ece45c
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-f9fac03a-6a21-4484-aebc-bc0263ece45c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8aac0f6a-e1e1-405a-bd13-1b9d7ea0050c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aac0f6a-e1e1-405a-bd13-1b9d7ea0050c
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8aac0f6a-e1e1-405a-bd13-1b9d7ea0050c
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
correlation: qa-50b891af-20a0-450b-a578-9f9c865e7d65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50b891af-20a0-450b-a578-9f9c865e7d65
Content-Type: application/json

--- request body ---
{"handle":"qa-8261d1aaade7","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50b891af-20a0-450b-a578-9f9c865e7d65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50b891af-20a0-450b-a578-9f9c865e7d65"}
```
