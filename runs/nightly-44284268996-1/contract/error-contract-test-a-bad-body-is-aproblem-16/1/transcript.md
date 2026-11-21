# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-29a3d551-260b-4c5a-9091-d5f3c860349f` |
| 2 | `POST /v1/accounts` | 201 | 5 | `qa-3a536c04-9e99-4d6a-a404-ee954273cc56` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-c43de010-2b79-4611-98aa-6172da04cacd` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-3d275845-8da8-4cf3-9af6-3f77c16c2a6d` |
| 5 | `POST /v1/credits/purchases` | 415 | 3 | `qa-2fe21567-c05c-47ad-a12f-fcbdeee31514` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-608ae80b-4164-41d3-b512-71f205494914` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d7b5454b-dd2b-4ee3-a38b-94399100353f` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-142fa062-f086-431f-922e-ffebaa9e9ac0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-cd6f38e2-3663-4e70-a0f2-11403e422aaa` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-e12ac4b3-6ffd-4413-9fcb-709b70366e66` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29a3d551-260b-4c5a-9091-d5f3c860349f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29a3d551-260b-4c5a-9091-d5f3c860349f
Content-Type: application/json

--- request body ---
{"handle":"qa-ca78a03636ff","displayName":"QA ca78a03636ff","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-29a3d551-260b-4c5a-9091-d5f3c860349f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Location: /v1/accounts/qa-ca78a03636ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0403b252-4aca-4643-8330-35b74e48c54f","handle":"qa-ca78a03636ff","displayName":"QA ca78a03636ff","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.025133627Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a536c04-9e99-4d6a-a404-ee954273cc56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a536c04-9e99-4d6a-a404-ee954273cc56
Content-Type: application/json

--- request body ---
{"handle":"qa-c811e2216ebf","displayName":"QA c811e2216ebf","password":"****","region":"eu"}

--- response: 201 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a536c04-9e99-4d6a-a404-ee954273cc56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Location: /v1/accounts/qa-c811e2216ebf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5936b811-e590-47bb-bc2f-164ad7af4e7d","handle":"qa-c811e2216ebf","displayName":"QA c811e2216ebf","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.039521478Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c43de010-2b79-4611-98aa-6172da04cacd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c43de010-2b79-4611-98aa-6172da04cacd
Content-Type: application/json

--- request body ---
{"handle":"qa-ca78a03636ff","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c43de010-2b79-4611-98aa-6172da04cacd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0403b252-4aca-4643-8330-35b74e48c54f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d275845-8da8-4cf3-9af6-3f77c16c2a6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d275845-8da8-4cf3-9af6-3f77c16c2a6d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c811e2216ebf","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d275845-8da8-4cf3-9af6-3f77c16c2a6d
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
Location: /v1/conversations/cnv_c598e298-5958-42b5-bcbc-87d89ef0da47
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c598e298-5958-42b5-bcbc-87d89ef0da47","subject":"Error contract","status":"open","region":"eu","participants":["qa-ca78a03636ff","qa-c811e2216ebf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:53.086302584Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2fe21567-c05c-47ad-a12f-fcbdeee31514

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3fcd22f895834a6f89117a47f42c2c42
X-Correlation-Id: qa-2fe21567-c05c-47ad-a12f-fcbdeee31514
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fe21567-c05c-47ad-a12f-fcbdeee31514
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-2fe21567-c05c-47ad-a12f-fcbdeee31514"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-608ae80b-4164-41d3-b512-71f205494914

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-608ae80b-4164-41d3-b512-71f205494914
Content-Type: application/json

--- request body ---
{"handle":"qa-c811e2216ebf","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-608ae80b-4164-41d3-b512-71f205494914
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5936b811-e590-47bb-bc2f-164ad7af4e7d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7b5454b-dd2b-4ee3-a38b-94399100353f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7b5454b-dd2b-4ee3-a38b-94399100353f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7b5454b-dd2b-4ee3-a38b-94399100353f
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
correlation: qa-142fa062-f086-431f-922e-ffebaa9e9ac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-142fa062-f086-431f-922e-ffebaa9e9ac0
Content-Type: application/json

--- request body ---
{"handle":"qa-c811e2216ebf","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-142fa062-f086-431f-922e-ffebaa9e9ac0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-142fa062-f086-431f-922e-ffebaa9e9ac0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd6f38e2-3663-4e70-a0f2-11403e422aaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd6f38e2-3663-4e70-a0f2-11403e422aaa
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd6f38e2-3663-4e70-a0f2-11403e422aaa
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
correlation: qa-e12ac4b3-6ffd-4413-9fcb-709b70366e66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e12ac4b3-6ffd-4413-9fcb-709b70366e66
Content-Type: application/json

--- request body ---
{"handle":"qa-ca78a03636ff","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e12ac4b3-6ffd-4413-9fcb-709b70366e66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e12ac4b3-6ffd-4413-9fcb-709b70366e66"}
```
