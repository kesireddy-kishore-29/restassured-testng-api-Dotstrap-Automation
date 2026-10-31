# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-7117db38-7611-4e00-aad6-aa002c77ab2c` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-136c8d7a-0831-44e9-985f-4dd8e8239148` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-7d433f46-3c2f-4a87-b410-bd58f8dd9a8a` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-81253290-9d72-45aa-b45a-684e8fbaefa8` |
| 5 | `POST /v1/auth/token` | 415 | 25 | `qa-6f8ac2b7-3115-4ebe-b939-211d9da7ed4b` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-2a597332-564f-4c23-b3f4-a720e8da243a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-d68b4efd-7838-4f00-8284-9cc633bd9911` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-06d84463-0b77-4a69-bbda-dad1099d4a7a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-3569a72e-fc3e-4242-a30c-48b941287020` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-19ccd527-6817-4864-abc8-1e4ed0ae8adc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7117db38-7611-4e00-aad6-aa002c77ab2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7117db38-7611-4e00-aad6-aa002c77ab2c
Content-Type: application/json

--- request body ---
{"handle":"qa-ec52608155d7","displayName":"QA ec52608155d7","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7117db38-7611-4e00-aad6-aa002c77ab2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-ec52608155d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c88e3720-3c74-4d8e-9915-3b77d1e5c17b","handle":"qa-ec52608155d7","displayName":"QA ec52608155d7","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.339413596Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-136c8d7a-0831-44e9-985f-4dd8e8239148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-136c8d7a-0831-44e9-985f-4dd8e8239148
Content-Type: application/json

--- request body ---
{"handle":"qa-eaae089bdf8e","displayName":"QA eaae089bdf8e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-136c8d7a-0831-44e9-985f-4dd8e8239148
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-eaae089bdf8e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80f41592-11df-4a21-baf0-5257675d9b57","handle":"qa-eaae089bdf8e","displayName":"QA eaae089bdf8e","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.374639543Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7d433f46-3c2f-4a87-b410-bd58f8dd9a8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d433f46-3c2f-4a87-b410-bd58f8dd9a8a
Content-Type: application/json

--- request body ---
{"handle":"qa-ec52608155d7","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d433f46-3c2f-4a87-b410-bd58f8dd9a8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c88e3720-3c74-4d8e-9915-3b77d1e5c17b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-81253290-9d72-45aa-b45a-684e8fbaefa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81253290-9d72-45aa-b45a-684e8fbaefa8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eaae089bdf8e","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-81253290-9d72-45aa-b45a-684e8fbaefa8
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
Location: /v1/conversations/cnv_75d20681-a1bf-4f65-9d82-35bfed6c470a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_75d20681-a1bf-4f65-9d82-35bfed6c470a","subject":"Error contract","status":"open","region":"eu","participants":["qa-ec52608155d7","qa-eaae089bdf8e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.428683543Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-6f8ac2b7-3115-4ebe-b939-211d9da7ed4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f8ac2b7-3115-4ebe-b939-211d9da7ed4b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f8ac2b7-3115-4ebe-b939-211d9da7ed4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-6f8ac2b7-3115-4ebe-b939-211d9da7ed4b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2a597332-564f-4c23-b3f4-a720e8da243a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a597332-564f-4c23-b3f4-a720e8da243a
Content-Type: application/json

--- request body ---
{"handle":"qa-eaae089bdf8e","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a597332-564f-4c23-b3f4-a720e8da243a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80f41592-11df-4a21-baf0-5257675d9b57"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d68b4efd-7838-4f00-8284-9cc633bd9911

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d68b4efd-7838-4f00-8284-9cc633bd9911
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d68b4efd-7838-4f00-8284-9cc633bd9911
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
correlation: qa-06d84463-0b77-4a69-bbda-dad1099d4a7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06d84463-0b77-4a69-bbda-dad1099d4a7a
Content-Type: application/json

--- request body ---
{"handle":"qa-eaae089bdf8e","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06d84463-0b77-4a69-bbda-dad1099d4a7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-06d84463-0b77-4a69-bbda-dad1099d4a7a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3569a72e-fc3e-4242-a30c-48b941287020

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3569a72e-fc3e-4242-a30c-48b941287020
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3569a72e-fc3e-4242-a30c-48b941287020
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-19ccd527-6817-4864-abc8-1e4ed0ae8adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19ccd527-6817-4864-abc8-1e4ed0ae8adc
Content-Type: application/json

--- request body ---
{"handle":"qa-ec52608155d7","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19ccd527-6817-4864-abc8-1e4ed0ae8adc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19ccd527-6817-4864-abc8-1e4ed0ae8adc"}
```
