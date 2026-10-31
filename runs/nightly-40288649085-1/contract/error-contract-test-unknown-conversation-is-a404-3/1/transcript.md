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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-83369af9-cea8-48cd-b6e4-79bac7bc6a24` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-eb2d43d6-160c-4f7f-84ed-58e6a006b89e` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 11 | `qa-235bc15e-ecc2-4b28-b0fc-38e904b3e859` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3532cb81-8f9f-49e7-ab2a-dcf5e16d7cd4` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-c593f1d1-3f38-408c-9fd6-0c8175cee68e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-83369af9-cea8-48cd-b6e4-79bac7bc6a24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83369af9-cea8-48cd-b6e4-79bac7bc6a24
Content-Type: application/json

--- request body ---
{"handle":"qa-f791a9532414","displayName":"QA f791a9532414","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-83369af9-cea8-48cd-b6e4-79bac7bc6a24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Location: /v1/accounts/qa-f791a9532414
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2ae1bc3-4146-45ea-9459-c52cf7c199a0","handle":"qa-f791a9532414","displayName":"QA f791a9532414","region":"eu","role":"user","createdAt":"2026-10-26T07:54:49.135472464Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-eb2d43d6-160c-4f7f-84ed-58e6a006b89e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb2d43d6-160c-4f7f-84ed-58e6a006b89e
Content-Type: application/json

--- request body ---
{"handle":"qa-f791a9532414","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb2d43d6-160c-4f7f-84ed-58e6a006b89e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2ae1bc3-4146-45ea-9459-c52cf7c199a0"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-235bc15e-ecc2-4b28-b0fc-38e904b3e859

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-235bc15e-ecc2-4b28-b0fc-38e904b3e859
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-235bc15e-ecc2-4b28-b0fc-38e904b3e859
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-235bc15e-ecc2-4b28-b0fc-38e904b3e859"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3532cb81-8f9f-49e7-ab2a-dcf5e16d7cd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3532cb81-8f9f-49e7-ab2a-dcf5e16d7cd4
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3532cb81-8f9f-49e7-ab2a-dcf5e16d7cd4
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
correlation: qa-c593f1d1-3f38-408c-9fd6-0c8175cee68e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c593f1d1-3f38-408c-9fd6-0c8175cee68e
Content-Type: application/json

--- request body ---
{"handle":"qa-f791a9532414","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c593f1d1-3f38-408c-9fd6-0c8175cee68e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c593f1d1-3f38-408c-9fd6-0c8175cee68e"}
```
