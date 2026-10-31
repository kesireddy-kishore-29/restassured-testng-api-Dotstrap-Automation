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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-ddfb544c-7722-4703-bdc8-55b57f61bac1` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-b3988bba-5a01-4205-80c9-6ec8d4ea8f62` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 24 | `qa-f1f5b128-b79e-477d-a258-a63c09cfac11` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3d1b0ace-eaab-4247-8fc9-2a55abc2be0d` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-8e409989-18a3-40a5-826f-834a80be7af3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ddfb544c-7722-4703-bdc8-55b57f61bac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddfb544c-7722-4703-bdc8-55b57f61bac1
Content-Type: application/json

--- request body ---
{"handle":"qa-38aaf4b0a13c","displayName":"QA 38aaf4b0a13c","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddfb544c-7722-4703-bdc8-55b57f61bac1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 5
Location: /v1/accounts/qa-38aaf4b0a13c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4dc6bc8f-4a28-419e-89bd-6a15f467f5c0","handle":"qa-38aaf4b0a13c","displayName":"QA 38aaf4b0a13c","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.676673999Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b3988bba-5a01-4205-80c9-6ec8d4ea8f62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3988bba-5a01-4205-80c9-6ec8d4ea8f62
Content-Type: application/json

--- request body ---
{"handle":"qa-38aaf4b0a13c","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3988bba-5a01-4205-80c9-6ec8d4ea8f62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4dc6bc8f-4a28-419e-89bd-6a15f467f5c0"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-f1f5b128-b79e-477d-a258-a63c09cfac11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f5b128-b79e-477d-a258-a63c09cfac11
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1f5b128-b79e-477d-a258-a63c09cfac11
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-f1f5b128-b79e-477d-a258-a63c09cfac11"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d1b0ace-eaab-4247-8fc9-2a55abc2be0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d1b0ace-eaab-4247-8fc9-2a55abc2be0d
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d1b0ace-eaab-4247-8fc9-2a55abc2be0d
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
correlation: qa-8e409989-18a3-40a5-826f-834a80be7af3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e409989-18a3-40a5-826f-834a80be7af3
Content-Type: application/json

--- request body ---
{"handle":"qa-38aaf4b0a13c","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e409989-18a3-40a5-826f-834a80be7af3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e409989-18a3-40a5-826f-834a80be7af3"}
```
