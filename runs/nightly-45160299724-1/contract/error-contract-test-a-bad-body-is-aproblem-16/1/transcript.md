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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-fbc8ec28-933a-4de5-8bb3-32a56899e674` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-65dcb486-dac1-4add-97e7-8a23cbe01e90` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-621fd418-3748-4f5a-ad02-18fcbbfa939f` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-ff46d92b-a01c-455d-b0da-b3bd2cd98cd1` |
| 5 | `POST /v1/credits/purchases` | 415 | 14 | `qa-d93f8cfa-6ed0-4409-8743-8d9565a3a053` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-98e76582-c25a-472c-a668-1dbf95c59884` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-8eae9023-09c1-4cb8-b7e3-538d60c9e1e4` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-9b6cb1cb-b5d6-46db-9bc1-72169219f82d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b8df4652-0a45-4878-b144-441dde1b0336` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-0c64d54f-ef35-43f0-abdc-2fd9d229766c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fbc8ec28-933a-4de5-8bb3-32a56899e674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbc8ec28-933a-4de5-8bb3-32a56899e674
Content-Type: application/json

--- request body ---
{"handle":"qa-0a87e5a32b92","displayName":"QA 0a87e5a32b92","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbc8ec28-933a-4de5-8bb3-32a56899e674
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Location: /v1/accounts/qa-0a87e5a32b92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c51b0fb8-6c3c-4fa8-8205-6ea4f89ae62a","handle":"qa-0a87e5a32b92","displayName":"QA 0a87e5a32b92","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.202614026Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-65dcb486-dac1-4add-97e7-8a23cbe01e90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65dcb486-dac1-4add-97e7-8a23cbe01e90
Content-Type: application/json

--- request body ---
{"handle":"qa-1c85c647b877","displayName":"QA 1c85c647b877","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-65dcb486-dac1-4add-97e7-8a23cbe01e90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Location: /v1/accounts/qa-1c85c647b877
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89deff09-acab-4cd3-9272-93317fe0b38e","handle":"qa-1c85c647b877","displayName":"QA 1c85c647b877","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.239786792Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-621fd418-3748-4f5a-ad02-18fcbbfa939f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-621fd418-3748-4f5a-ad02-18fcbbfa939f
Content-Type: application/json

--- request body ---
{"handle":"qa-0a87e5a32b92","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-621fd418-3748-4f5a-ad02-18fcbbfa939f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c51b0fb8-6c3c-4fa8-8205-6ea4f89ae62a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ff46d92b-a01c-455d-b0da-b3bd2cd98cd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff46d92b-a01c-455d-b0da-b3bd2cd98cd1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1c85c647b877","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff46d92b-a01c-455d-b0da-b3bd2cd98cd1
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
Location: /v1/conversations/cnv_c2744c20-7c46-4de9-b993-1fe428cebf93
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c2744c20-7c46-4de9-b993-1fe428cebf93","subject":"Error contract","status":"open","region":"eu","participants":["qa-0a87e5a32b92","qa-1c85c647b877"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:00.297998588Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d93f8cfa-6ed0-4409-8743-8d9565a3a053

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a25d5943323f4b08bf752909c467c11b
X-Correlation-Id: qa-d93f8cfa-6ed0-4409-8743-8d9565a3a053
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d93f8cfa-6ed0-4409-8743-8d9565a3a053
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-d93f8cfa-6ed0-4409-8743-8d9565a3a053"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-98e76582-c25a-472c-a668-1dbf95c59884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98e76582-c25a-472c-a668-1dbf95c59884
Content-Type: application/json

--- request body ---
{"handle":"qa-1c85c647b877","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-98e76582-c25a-472c-a668-1dbf95c59884
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89deff09-acab-4cd3-9272-93317fe0b38e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8eae9023-09c1-4cb8-b7e3-538d60c9e1e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8eae9023-09c1-4cb8-b7e3-538d60c9e1e4
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8eae9023-09c1-4cb8-b7e3-538d60c9e1e4
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
correlation: qa-9b6cb1cb-b5d6-46db-9bc1-72169219f82d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b6cb1cb-b5d6-46db-9bc1-72169219f82d
Content-Type: application/json

--- request body ---
{"handle":"qa-1c85c647b877","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b6cb1cb-b5d6-46db-9bc1-72169219f82d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b6cb1cb-b5d6-46db-9bc1-72169219f82d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8df4652-0a45-4878-b144-441dde1b0336

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8df4652-0a45-4878-b144-441dde1b0336
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8df4652-0a45-4878-b144-441dde1b0336
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
correlation: qa-0c64d54f-ef35-43f0-abdc-2fd9d229766c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c64d54f-ef35-43f0-abdc-2fd9d229766c
Content-Type: application/json

--- request body ---
{"handle":"qa-0a87e5a32b92","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c64d54f-ef35-43f0-abdc-2fd9d229766c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c64d54f-ef35-43f0-abdc-2fd9d229766c"}
```
