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
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-c3b8fd48-b425-41eb-863b-8c153eafff53` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-4bf8fb66-70c5-4154-a586-930d119590fd` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-4130ab1f-3cf8-4c81-b5c3-60157c76924f` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-16258024-bb2a-4dc1-837e-2f1052c07f31` |
| 5 | `POST /v1/conversations` | 415 | 16 | `qa-fbeec16d-ca99-474e-97ad-332e9244e05a` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-e0d164d8-aa3e-44a6-ab96-3b1777a8afce` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-53bbe416-9e2e-4ac0-ac34-7290d71cccde` |
| 8 | `POST /v1/auth/token` | 401 | 52 | `qa-18c8e412-d64f-42d5-892a-d0a844811657` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-f14fbad3-ac71-4551-b8f6-023218974ac6` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-a318efc3-569d-4ea7-affe-ffc4a9236d32` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c3b8fd48-b425-41eb-863b-8c153eafff53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3b8fd48-b425-41eb-863b-8c153eafff53
Content-Type: application/json

--- request body ---
{"handle":"qa-bb03f5672653","displayName":"QA bb03f5672653","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3b8fd48-b425-41eb-863b-8c153eafff53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-bb03f5672653
X-Served-Region: eu
Content-Length: 181

{"id":"acc_009609e6-2c51-473f-b29a-b0d8170aba59","handle":"qa-bb03f5672653","displayName":"QA bb03f5672653","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.933197342Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4bf8fb66-70c5-4154-a586-930d119590fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bf8fb66-70c5-4154-a586-930d119590fd
Content-Type: application/json

--- request body ---
{"handle":"qa-06e514dc5a78","displayName":"QA 06e514dc5a78","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bf8fb66-70c5-4154-a586-930d119590fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Location: /v1/accounts/qa-06e514dc5a78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78c56db7-54c8-47a0-9219-f84d932f23a6","handle":"qa-06e514dc5a78","displayName":"QA 06e514dc5a78","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.975233589Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4130ab1f-3cf8-4c81-b5c3-60157c76924f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4130ab1f-3cf8-4c81-b5c3-60157c76924f
Content-Type: application/json

--- request body ---
{"handle":"qa-bb03f5672653","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-4130ab1f-3cf8-4c81-b5c3-60157c76924f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_009609e6-2c51-473f-b29a-b0d8170aba59"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-16258024-bb2a-4dc1-837e-2f1052c07f31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16258024-bb2a-4dc1-837e-2f1052c07f31
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-06e514dc5a78","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-16258024-bb2a-4dc1-837e-2f1052c07f31
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
Location: /v1/conversations/cnv_f6137211-eda1-418e-a955-78e578f9d3e1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f6137211-eda1-418e-a955-78e578f9d3e1","subject":"Error contract","status":"open","region":"eu","participants":["qa-bb03f5672653","qa-06e514dc5a78"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.050830553Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-fbeec16d-ca99-474e-97ad-332e9244e05a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbeec16d-ca99-474e-97ad-332e9244e05a
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbeec16d-ca99-474e-97ad-332e9244e05a
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-fbeec16d-ca99-474e-97ad-332e9244e05a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e0d164d8-aa3e-44a6-ab96-3b1777a8afce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0d164d8-aa3e-44a6-ab96-3b1777a8afce
Content-Type: application/json

--- request body ---
{"handle":"qa-06e514dc5a78","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0d164d8-aa3e-44a6-ab96-3b1777a8afce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78c56db7-54c8-47a0-9219-f84d932f23a6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-53bbe416-9e2e-4ac0-ac34-7290d71cccde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53bbe416-9e2e-4ac0-ac34-7290d71cccde
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-53bbe416-9e2e-4ac0-ac34-7290d71cccde
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
correlation: qa-18c8e412-d64f-42d5-892a-d0a844811657

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18c8e412-d64f-42d5-892a-d0a844811657
Content-Type: application/json

--- request body ---
{"handle":"qa-06e514dc5a78","password":"****"}

--- response: 401 in 52 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18c8e412-d64f-42d5-892a-d0a844811657
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18c8e412-d64f-42d5-892a-d0a844811657"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f14fbad3-ac71-4551-b8f6-023218974ac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f14fbad3-ac71-4551-b8f6-023218974ac6
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f14fbad3-ac71-4551-b8f6-023218974ac6
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
correlation: qa-a318efc3-569d-4ea7-affe-ffc4a9236d32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a318efc3-569d-4ea7-affe-ffc4a9236d32
Content-Type: application/json

--- request body ---
{"handle":"qa-bb03f5672653","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a318efc3-569d-4ea7-affe-ffc4a9236d32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a318efc3-569d-4ea7-affe-ffc4a9236d32"}
```
