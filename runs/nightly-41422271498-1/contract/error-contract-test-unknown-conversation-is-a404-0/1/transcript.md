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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-4d851642-ce54-45d0-9a9c-788965e098c6` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-76eea5db-3267-43c9-85fc-e0fa0413c0e2` |
| 3 | `GET /v1/conversations/{id}` | 404 | 21 | `qa-3dcd1cb7-723c-4976-ae4b-9b798aac7087` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-d5f62b47-5c9f-4696-b7e1-0093c0e70abe` |
| 5 | `POST /v1/auth/token` | 401 | 25 | `qa-369a09e4-55b3-4e5b-ad7d-7f0ce664a5b0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4d851642-ce54-45d0-9a9c-788965e098c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d851642-ce54-45d0-9a9c-788965e098c6
Content-Type: application/json

--- request body ---
{"handle":"qa-5aa559b90cae","displayName":"QA 5aa559b90cae","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d851642-ce54-45d0-9a9c-788965e098c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Location: /v1/accounts/qa-5aa559b90cae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bcb490e8-d690-4b5f-8442-6c751863bac7","handle":"qa-5aa559b90cae","displayName":"QA 5aa559b90cae","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.953162543Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-76eea5db-3267-43c9-85fc-e0fa0413c0e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76eea5db-3267-43c9-85fc-e0fa0413c0e2
Content-Type: application/json

--- request body ---
{"handle":"qa-5aa559b90cae","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-76eea5db-3267-43c9-85fc-e0fa0413c0e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bcb490e8-d690-4b5f-8442-6c751863bac7"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-3dcd1cb7-723c-4976-ae4b-9b798aac7087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dcd1cb7-723c-4976-ae4b-9b798aac7087
Content-Type: application/json

--- response: 404 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dcd1cb7-723c-4976-ae4b-9b798aac7087
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-3dcd1cb7-723c-4976-ae4b-9b798aac7087"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5f62b47-5c9f-4696-b7e1-0093c0e70abe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5f62b47-5c9f-4696-b7e1-0093c0e70abe
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5f62b47-5c9f-4696-b7e1-0093c0e70abe
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
correlation: qa-369a09e4-55b3-4e5b-ad7d-7f0ce664a5b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-369a09e4-55b3-4e5b-ad7d-7f0ce664a5b0
Content-Type: application/json

--- request body ---
{"handle":"qa-5aa559b90cae","password":"****"}

--- response: 401 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-369a09e4-55b3-4e5b-ad7d-7f0ce664a5b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-369a09e4-55b3-4e5b-ad7d-7f0ce664a5b0"}
```
