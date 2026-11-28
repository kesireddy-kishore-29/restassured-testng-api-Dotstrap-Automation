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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-315966cb-eec9-4a1d-82ac-f1edb1da065b` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-3d63980d-7690-41ed-8986-7511592edf13` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-0ca24d93-9c25-40cb-ad51-7b0b24d60243` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-e2ef8538-bded-4600-a7c9-143f63d9319c` |
| 5 | `PATCH /v1/accounts/me` | 415 | 11 | `qa-d588f0d4-2669-41a8-b884-e487a9d2cd7e` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-15172245-e41f-44d6-b3ec-1fa1c4cb47b2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-9183df4a-fda0-47af-a755-492e05cee2f9` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-79d2848b-8e1d-40a4-bd66-1147b5547310` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-280e40b8-5f8a-407e-b0b1-b6be5f4aea71` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-3971cedd-75e4-4947-9a5e-7056a8404818` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-315966cb-eec9-4a1d-82ac-f1edb1da065b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-315966cb-eec9-4a1d-82ac-f1edb1da065b
Content-Type: application/json

--- request body ---
{"handle":"qa-43dc262a6956","displayName":"QA 43dc262a6956","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-315966cb-eec9-4a1d-82ac-f1edb1da065b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Location: /v1/accounts/qa-43dc262a6956
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05f7da1e-56b5-45e4-8004-4c5e768f586a","handle":"qa-43dc262a6956","displayName":"QA 43dc262a6956","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.513972352Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3d63980d-7690-41ed-8986-7511592edf13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d63980d-7690-41ed-8986-7511592edf13
Content-Type: application/json

--- request body ---
{"handle":"qa-870ee310888d","displayName":"QA 870ee310888d","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d63980d-7690-41ed-8986-7511592edf13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Location: /v1/accounts/qa-870ee310888d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ff0ec80-f5ea-49ec-bd19-399976d63580","handle":"qa-870ee310888d","displayName":"QA 870ee310888d","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.556656083Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0ca24d93-9c25-40cb-ad51-7b0b24d60243

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ca24d93-9c25-40cb-ad51-7b0b24d60243
Content-Type: application/json

--- request body ---
{"handle":"qa-43dc262a6956","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ca24d93-9c25-40cb-ad51-7b0b24d60243
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05f7da1e-56b5-45e4-8004-4c5e768f586a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e2ef8538-bded-4600-a7c9-143f63d9319c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2ef8538-bded-4600-a7c9-143f63d9319c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-870ee310888d","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2ef8538-bded-4600-a7c9-143f63d9319c
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
Location: /v1/conversations/cnv_f8538754-9f41-44c9-bf72-a383ca7411a8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f8538754-9f41-44c9-bf72-a383ca7411a8","subject":"Error contract","status":"open","region":"eu","participants":["qa-43dc262a6956","qa-870ee310888d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.612394032Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d588f0d4-2669-41a8-b884-e487a9d2cd7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d588f0d4-2669-41a8-b884-e487a9d2cd7e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d588f0d4-2669-41a8-b884-e487a9d2cd7e
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-d588f0d4-2669-41a8-b884-e487a9d2cd7e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-15172245-e41f-44d6-b3ec-1fa1c4cb47b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15172245-e41f-44d6-b3ec-1fa1c4cb47b2
Content-Type: application/json

--- request body ---
{"handle":"qa-870ee310888d","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-15172245-e41f-44d6-b3ec-1fa1c4cb47b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ff0ec80-f5ea-49ec-bd19-399976d63580"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9183df4a-fda0-47af-a755-492e05cee2f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9183df4a-fda0-47af-a755-492e05cee2f9
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9183df4a-fda0-47af-a755-492e05cee2f9
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
correlation: qa-79d2848b-8e1d-40a4-bd66-1147b5547310

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79d2848b-8e1d-40a4-bd66-1147b5547310
Content-Type: application/json

--- request body ---
{"handle":"qa-870ee310888d","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79d2848b-8e1d-40a4-bd66-1147b5547310
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-79d2848b-8e1d-40a4-bd66-1147b5547310"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-280e40b8-5f8a-407e-b0b1-b6be5f4aea71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-280e40b8-5f8a-407e-b0b1-b6be5f4aea71
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-280e40b8-5f8a-407e-b0b1-b6be5f4aea71
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
correlation: qa-3971cedd-75e4-4947-9a5e-7056a8404818

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3971cedd-75e4-4947-9a5e-7056a8404818
Content-Type: application/json

--- request body ---
{"handle":"qa-43dc262a6956","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3971cedd-75e4-4947-9a5e-7056a8404818
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3971cedd-75e4-4947-9a5e-7056a8404818"}
```
