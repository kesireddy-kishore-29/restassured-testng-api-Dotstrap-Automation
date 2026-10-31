# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-bf0b9726-6398-4ac0-b535-b6d1430d15d1` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-e6f27b4b-5656-4b1c-ac79-65dc65c948d2` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-13678043-5453-4cb6-9570-482528d69a1e` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-1abdee37-25b0-4955-8a83-4c8e56263611` |
| 5 | `PATCH /v1/accounts/me` | 415 | 13 | `qa-76592d81-548e-4819-9382-c169b462a906` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-8b53e48c-cb12-438f-a647-858c08a029c4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-cff3a302-cf74-46e6-ad1a-87e00f8f244e` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-336b2c3e-5efb-44d0-ab93-9eff6a812b2b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-275a73c7-8ab0-4989-9a90-eabbfd3929d2` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-3b0e467c-037f-4691-bf81-a9371e7ff8ed` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bf0b9726-6398-4ac0-b535-b6d1430d15d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0b9726-6398-4ac0-b535-b6d1430d15d1
Content-Type: application/json

--- request body ---
{"handle":"qa-6a1d131e2e65","displayName":"QA 6a1d131e2e65","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf0b9726-6398-4ac0-b535-b6d1430d15d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 9
Location: /v1/accounts/qa-6a1d131e2e65
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c4f5ee9-9195-46db-8e76-56e27ded9d75","handle":"qa-6a1d131e2e65","displayName":"QA 6a1d131e2e65","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.386372642Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e6f27b4b-5656-4b1c-ac79-65dc65c948d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6f27b4b-5656-4b1c-ac79-65dc65c948d2
Content-Type: application/json

--- request body ---
{"handle":"qa-c3827b35131d","displayName":"QA c3827b35131d","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6f27b4b-5656-4b1c-ac79-65dc65c948d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 9
Location: /v1/accounts/qa-c3827b35131d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5558b6c5-c44d-4dd3-9755-024e7c492575","handle":"qa-c3827b35131d","displayName":"QA c3827b35131d","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.416071638Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-13678043-5453-4cb6-9570-482528d69a1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13678043-5453-4cb6-9570-482528d69a1e
Content-Type: application/json

--- request body ---
{"handle":"qa-6a1d131e2e65","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-13678043-5453-4cb6-9570-482528d69a1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c4f5ee9-9195-46db-8e76-56e27ded9d75"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1abdee37-25b0-4955-8a83-4c8e56263611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1abdee37-25b0-4955-8a83-4c8e56263611
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c3827b35131d","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1abdee37-25b0-4955-8a83-4c8e56263611
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
Location: /v1/conversations/cnv_1d7c942c-f8d5-4de5-80a9-ae9a2fc1129b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1d7c942c-f8d5-4de5-80a9-ae9a2fc1129b","subject":"Error contract","status":"open","region":"eu","participants":["qa-6a1d131e2e65","qa-c3827b35131d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.493543365Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-76592d81-548e-4819-9382-c169b462a906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76592d81-548e-4819-9382-c169b462a906
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76592d81-548e-4819-9382-c169b462a906
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-76592d81-548e-4819-9382-c169b462a906"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8b53e48c-cb12-438f-a647-858c08a029c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b53e48c-cb12-438f-a647-858c08a029c4
Content-Type: application/json

--- request body ---
{"handle":"qa-c3827b35131d","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b53e48c-cb12-438f-a647-858c08a029c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5558b6c5-c44d-4dd3-9755-024e7c492575"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cff3a302-cf74-46e6-ad1a-87e00f8f244e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cff3a302-cf74-46e6-ad1a-87e00f8f244e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cff3a302-cf74-46e6-ad1a-87e00f8f244e
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
correlation: qa-336b2c3e-5efb-44d0-ab93-9eff6a812b2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-336b2c3e-5efb-44d0-ab93-9eff6a812b2b
Content-Type: application/json

--- request body ---
{"handle":"qa-c3827b35131d","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-336b2c3e-5efb-44d0-ab93-9eff6a812b2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-336b2c3e-5efb-44d0-ab93-9eff6a812b2b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-275a73c7-8ab0-4989-9a90-eabbfd3929d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-275a73c7-8ab0-4989-9a90-eabbfd3929d2
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-275a73c7-8ab0-4989-9a90-eabbfd3929d2
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
correlation: qa-3b0e467c-037f-4691-bf81-a9371e7ff8ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b0e467c-037f-4691-bf81-a9371e7ff8ed
Content-Type: application/json

--- request body ---
{"handle":"qa-6a1d131e2e65","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b0e467c-037f-4691-bf81-a9371e7ff8ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3b0e467c-037f-4691-bf81-a9371e7ff8ed"}
```
