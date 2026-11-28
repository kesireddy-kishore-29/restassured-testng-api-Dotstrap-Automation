# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-690c0d1d-842e-4a4a-b7e0-9294107bf6d7` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-e4ea0b4f-4011-4db8-8c26-bd97a483a57b` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-ef2dd8bb-a722-4fe9-9481-ffe7fd924a2a` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-6969223a-fa6e-4dae-b019-b0e8a64abf5d` |
| 5 | `POST /v1/conversations` | 415 | 17 | `qa-9507da7b-94c8-4941-98e8-fce7b49406ce` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-bac4a0f8-50f8-483d-9be8-c02d22d5b401` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-728fd04b-893a-4c37-96eb-0cb1160af0c1` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-8553e7e7-5e99-47d1-aa0e-38606e538148` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-ce7ac851-f0f9-40a3-8ee7-d48266dd574a` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-dcaa67a7-b672-41a2-933b-ba7435520a11` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-690c0d1d-842e-4a4a-b7e0-9294107bf6d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-690c0d1d-842e-4a4a-b7e0-9294107bf6d7
Content-Type: application/json

--- request body ---
{"handle":"qa-7d870e6fabcd","displayName":"QA 7d870e6fabcd","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-690c0d1d-842e-4a4a-b7e0-9294107bf6d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-7d870e6fabcd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e81f05c2-01e6-4366-bde8-5a299c8fe969","handle":"qa-7d870e6fabcd","displayName":"QA 7d870e6fabcd","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.048456977Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e4ea0b4f-4011-4db8-8c26-bd97a483a57b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4ea0b4f-4011-4db8-8c26-bd97a483a57b
Content-Type: application/json

--- request body ---
{"handle":"qa-3dcb8d9516fc","displayName":"QA 3dcb8d9516fc","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4ea0b4f-4011-4db8-8c26-bd97a483a57b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Location: /v1/accounts/qa-3dcb8d9516fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1168a70-e2a7-4e61-a74e-1056bd97e6ba","handle":"qa-3dcb8d9516fc","displayName":"QA 3dcb8d9516fc","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.133992915Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ef2dd8bb-a722-4fe9-9481-ffe7fd924a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef2dd8bb-a722-4fe9-9481-ffe7fd924a2a
Content-Type: application/json

--- request body ---
{"handle":"qa-7d870e6fabcd","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef2dd8bb-a722-4fe9-9481-ffe7fd924a2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e81f05c2-01e6-4366-bde8-5a299c8fe969"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6969223a-fa6e-4dae-b019-b0e8a64abf5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6969223a-fa6e-4dae-b019-b0e8a64abf5d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3dcb8d9516fc","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6969223a-fa6e-4dae-b019-b0e8a64abf5d
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
Location: /v1/conversations/cnv_6ff39941-9d8f-4ed4-bf6b-28519cbd2713
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6ff39941-9d8f-4ed4-bf6b-28519cbd2713","subject":"Error contract","status":"open","region":"eu","participants":["qa-7d870e6fabcd","qa-3dcb8d9516fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.198783631Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9507da7b-94c8-4941-98e8-fce7b49406ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9507da7b-94c8-4941-98e8-fce7b49406ce
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9507da7b-94c8-4941-98e8-fce7b49406ce
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-9507da7b-94c8-4941-98e8-fce7b49406ce"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bac4a0f8-50f8-483d-9be8-c02d22d5b401

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac4a0f8-50f8-483d-9be8-c02d22d5b401
Content-Type: application/json

--- request body ---
{"handle":"qa-3dcb8d9516fc","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-bac4a0f8-50f8-483d-9be8-c02d22d5b401
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1168a70-e2a7-4e61-a74e-1056bd97e6ba"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-728fd04b-893a-4c37-96eb-0cb1160af0c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-728fd04b-893a-4c37-96eb-0cb1160af0c1
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-728fd04b-893a-4c37-96eb-0cb1160af0c1
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
correlation: qa-8553e7e7-5e99-47d1-aa0e-38606e538148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8553e7e7-5e99-47d1-aa0e-38606e538148
Content-Type: application/json

--- request body ---
{"handle":"qa-3dcb8d9516fc","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8553e7e7-5e99-47d1-aa0e-38606e538148
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8553e7e7-5e99-47d1-aa0e-38606e538148"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce7ac851-f0f9-40a3-8ee7-d48266dd574a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce7ac851-f0f9-40a3-8ee7-d48266dd574a
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce7ac851-f0f9-40a3-8ee7-d48266dd574a
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
correlation: qa-dcaa67a7-b672-41a2-933b-ba7435520a11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcaa67a7-b672-41a2-933b-ba7435520a11
Content-Type: application/json

--- request body ---
{"handle":"qa-7d870e6fabcd","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dcaa67a7-b672-41a2-933b-ba7435520a11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dcaa67a7-b672-41a2-933b-ba7435520a11"}
```
