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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-4b897732-42a2-4bfb-bb23-f67bb76e9183` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-af068476-d6cb-4e37-845c-9fe2386ab1ca` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 17 | `qa-676c90aa-9614-4817-a880-2134d86242fc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-f8fea4d4-629e-4f87-9242-801b7e685820` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-8436ab54-01fb-41c8-a1af-f275b0eb558d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4b897732-42a2-4bfb-bb23-f67bb76e9183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b897732-42a2-4bfb-bb23-f67bb76e9183
Content-Type: application/json

--- request body ---
{"handle":"qa-3a089c1d2b2a","displayName":"QA 3a089c1d2b2a","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b897732-42a2-4bfb-bb23-f67bb76e9183
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 5
Location: /v1/accounts/qa-3a089c1d2b2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_42571ee0-5c2c-431b-bf82-4c200b5278d7","handle":"qa-3a089c1d2b2a","displayName":"QA 3a089c1d2b2a","region":"eu","role":"user","createdAt":"2026-11-21T09:57:13.163908005Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-af068476-d6cb-4e37-845c-9fe2386ab1ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af068476-d6cb-4e37-845c-9fe2386ab1ca
Content-Type: application/json

--- request body ---
{"handle":"qa-3a089c1d2b2a","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-af068476-d6cb-4e37-845c-9fe2386ab1ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_42571ee0-5c2c-431b-bf82-4c200b5278d7"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-676c90aa-9614-4817-a880-2134d86242fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-676c90aa-9614-4817-a880-2134d86242fc
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-676c90aa-9614-4817-a880-2134d86242fc
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-676c90aa-9614-4817-a880-2134d86242fc"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8fea4d4-629e-4f87-9242-801b7e685820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8fea4d4-629e-4f87-9242-801b7e685820
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8fea4d4-629e-4f87-9242-801b7e685820
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
correlation: qa-8436ab54-01fb-41c8-a1af-f275b0eb558d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8436ab54-01fb-41c8-a1af-f275b0eb558d
Content-Type: application/json

--- request body ---
{"handle":"qa-3a089c1d2b2a","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8436ab54-01fb-41c8-a1af-f275b0eb558d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8436ab54-01fb-41c8-a1af-f275b0eb558d"}
```
