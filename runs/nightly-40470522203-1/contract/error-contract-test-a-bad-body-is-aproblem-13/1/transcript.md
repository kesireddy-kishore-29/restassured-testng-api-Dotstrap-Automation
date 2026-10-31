# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-446e2253-dc19-4511-b56e-3a791d4f8cb8` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-9e0693ce-6ff4-4581-849c-e17aee4472e2` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-f8be89bc-2d7b-478e-a153-79ac9685eac1` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-e7610011-e25b-48e8-830a-a7c95f9fd85f` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 29 | `qa-94c56e18-1dc9-42c2-a5bf-efc54df0606c` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-f1befbb6-b7a0-45ce-8cb0-b15d51ae4bcf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-12088284-165a-42ac-81e1-8f476b4d736b` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-3f64a813-a4a7-4497-bac9-629af0983392` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b5ed338b-fda0-452b-aee5-b4b591d5b6be` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-7c6e8dcd-3eb1-434f-948b-1eb429f82ce5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-446e2253-dc19-4511-b56e-3a791d4f8cb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-446e2253-dc19-4511-b56e-3a791d4f8cb8
Content-Type: application/json

--- request body ---
{"handle":"qa-c099c6cfc35c","displayName":"QA c099c6cfc35c","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-446e2253-dc19-4511-b56e-3a791d4f8cb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Location: /v1/accounts/qa-c099c6cfc35c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1a52f1a-d498-4a39-92c2-a23967eeaecd","handle":"qa-c099c6cfc35c","displayName":"QA c099c6cfc35c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.381053043Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9e0693ce-6ff4-4581-849c-e17aee4472e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e0693ce-6ff4-4581-849c-e17aee4472e2
Content-Type: application/json

--- request body ---
{"handle":"qa-0a2f7739d135","displayName":"QA 0a2f7739d135","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e0693ce-6ff4-4581-849c-e17aee4472e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Location: /v1/accounts/qa-0a2f7739d135
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b108f724-70b8-4b5d-b1ee-b0a470b7341a","handle":"qa-0a2f7739d135","displayName":"QA 0a2f7739d135","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.445399960Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f8be89bc-2d7b-478e-a153-79ac9685eac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8be89bc-2d7b-478e-a153-79ac9685eac1
Content-Type: application/json

--- request body ---
{"handle":"qa-c099c6cfc35c","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8be89bc-2d7b-478e-a153-79ac9685eac1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b1a52f1a-d498-4a39-92c2-a23967eeaecd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e7610011-e25b-48e8-830a-a7c95f9fd85f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7610011-e25b-48e8-830a-a7c95f9fd85f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0a2f7739d135","subject":"Error contract","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7610011-e25b-48e8-830a-a7c95f9fd85f
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
Location: /v1/conversations/cnv_b2e5256e-d6c4-47a3-8c64-823e8f65c4fc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b2e5256e-d6c4-47a3-8c64-823e8f65c4fc","subject":"Error contract","status":"open","region":"eu","participants":["qa-c099c6cfc35c","qa-0a2f7739d135"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.559883665Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b2e5256e-d6c4-47a3-8c64-823e8f65c4fc/messages
correlation: qa-94c56e18-1dc9-42c2-a5bf-efc54df0606c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94c56e18-1dc9-42c2-a5bf-efc54df0606c
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94c56e18-1dc9-42c2-a5bf-efc54df0606c
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_b2e5256e-d6c4-47a3-8c64-823e8f65c4fc/messages","correlationId":"qa-94c56e18-1dc9-42c2-a5bf-efc54df0606c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f1befbb6-b7a0-45ce-8cb0-b15d51ae4bcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1befbb6-b7a0-45ce-8cb0-b15d51ae4bcf
Content-Type: application/json

--- request body ---
{"handle":"qa-0a2f7739d135","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1befbb6-b7a0-45ce-8cb0-b15d51ae4bcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b108f724-70b8-4b5d-b1ee-b0a470b7341a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-12088284-165a-42ac-81e1-8f476b4d736b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12088284-165a-42ac-81e1-8f476b4d736b
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-12088284-165a-42ac-81e1-8f476b4d736b
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-3f64a813-a4a7-4497-bac9-629af0983392

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f64a813-a4a7-4497-bac9-629af0983392
Content-Type: application/json

--- request body ---
{"handle":"qa-0a2f7739d135","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f64a813-a4a7-4497-bac9-629af0983392
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f64a813-a4a7-4497-bac9-629af0983392"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5ed338b-fda0-452b-aee5-b4b591d5b6be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ed338b-fda0-452b-aee5-b4b591d5b6be
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5ed338b-fda0-452b-aee5-b4b591d5b6be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7c6e8dcd-3eb1-434f-948b-1eb429f82ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c6e8dcd-3eb1-434f-948b-1eb429f82ce5
Content-Type: application/json

--- request body ---
{"handle":"qa-c099c6cfc35c","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c6e8dcd-3eb1-434f-948b-1eb429f82ce5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c6e8dcd-3eb1-434f-948b-1eb429f82ce5"}
```
