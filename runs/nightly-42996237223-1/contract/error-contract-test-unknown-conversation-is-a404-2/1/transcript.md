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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-2f2324ab-e497-4723-ad52-52e119449bcc` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-319163e6-b85e-4b1a-a243-4f4f0a6466ca` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 14 | `qa-d68db4fe-3f98-4506-97c1-0754b85ae16b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-02ea7758-5e98-4d2c-83e8-00cd6b366ea8` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-c6a62be6-172e-456e-a0ef-d54aab997ba5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2f2324ab-e497-4723-ad52-52e119449bcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f2324ab-e497-4723-ad52-52e119449bcc
Content-Type: application/json

--- request body ---
{"handle":"qa-43e7c15cd294","displayName":"QA 43e7c15cd294","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f2324ab-e497-4723-ad52-52e119449bcc
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
Location: /v1/accounts/qa-43e7c15cd294
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d824515b-f7cc-4921-a2fa-4951143d00ba","handle":"qa-43e7c15cd294","displayName":"QA 43e7c15cd294","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.478645419Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-319163e6-b85e-4b1a-a243-4f4f0a6466ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-319163e6-b85e-4b1a-a243-4f4f0a6466ca
Content-Type: application/json

--- request body ---
{"handle":"qa-43e7c15cd294","password":"****"}

--- response: 200 in 46 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-319163e6-b85e-4b1a-a243-4f4f0a6466ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d824515b-f7cc-4921-a2fa-4951143d00ba"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-d68db4fe-3f98-4506-97c1-0754b85ae16b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d68db4fe-3f98-4506-97c1-0754b85ae16b
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d68db4fe-3f98-4506-97c1-0754b85ae16b
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-d68db4fe-3f98-4506-97c1-0754b85ae16b"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02ea7758-5e98-4d2c-83e8-00cd6b366ea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02ea7758-5e98-4d2c-83e8-00cd6b366ea8
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02ea7758-5e98-4d2c-83e8-00cd6b366ea8
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
correlation: qa-c6a62be6-172e-456e-a0ef-d54aab997ba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6a62be6-172e-456e-a0ef-d54aab997ba5
Content-Type: application/json

--- request body ---
{"handle":"qa-43e7c15cd294","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6a62be6-172e-456e-a0ef-d54aab997ba5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c6a62be6-172e-456e-a0ef-d54aab997ba5"}
```
