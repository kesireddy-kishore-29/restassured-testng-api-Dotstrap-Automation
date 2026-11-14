# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-f61a374f-5c73-4c4c-b36e-08438d51587c` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-87f14d20-0606-4841-8edb-7cc29ae09013` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-b588d207-6793-46ab-961d-c39661669cd6` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-87b61737-85a8-4f8a-982d-96b411f768da` |
| 5 | `POST /v1/accounts` | 422 | 34 | `qa-6a4c4353-031a-4884-9762-7b5ec7394ea3` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-29f7990a-2dc6-48ed-a7e9-f72435862bc3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-624fa7af-b1c6-4ca6-bcf8-e5c45455ed04` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-94f38e01-9c61-440a-aff7-d1c2f28fc785` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c852334a-0d04-41a5-ba0b-299c54790a02` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-e86584cc-3c2e-44fd-b7e3-ce0d005a232f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f61a374f-5c73-4c4c-b36e-08438d51587c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f61a374f-5c73-4c4c-b36e-08438d51587c
Content-Type: application/json

--- request body ---
{"handle":"qa-e1f52a019971","displayName":"QA e1f52a019971","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f61a374f-5c73-4c4c-b36e-08438d51587c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 9
Location: /v1/accounts/qa-e1f52a019971
X-Served-Region: eu
Content-Length: 181

{"id":"acc_26afe675-33e3-4fef-bff1-ec585c0cc5c7","handle":"qa-e1f52a019971","displayName":"QA e1f52a019971","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.687781485Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-87f14d20-0606-4841-8edb-7cc29ae09013

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87f14d20-0606-4841-8edb-7cc29ae09013
Content-Type: application/json

--- request body ---
{"handle":"qa-d541c6130644","displayName":"QA d541c6130644","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-87f14d20-0606-4841-8edb-7cc29ae09013
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 9
Location: /v1/accounts/qa-d541c6130644
X-Served-Region: eu
Content-Length: 181

{"id":"acc_304b5306-11ab-4805-abf5-41775f8edc1f","handle":"qa-d541c6130644","displayName":"QA d541c6130644","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.716256182Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b588d207-6793-46ab-961d-c39661669cd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b588d207-6793-46ab-961d-c39661669cd6
Content-Type: application/json

--- request body ---
{"handle":"qa-e1f52a019971","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b588d207-6793-46ab-961d-c39661669cd6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_26afe675-33e3-4fef-bff1-ec585c0cc5c7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-87b61737-85a8-4f8a-982d-96b411f768da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87b61737-85a8-4f8a-982d-96b411f768da
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d541c6130644","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-87b61737-85a8-4f8a-982d-96b411f768da
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
Location: /v1/conversations/cnv_42f78d69-c2c8-4c53-8813-86f64a02c253
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_42f78d69-c2c8-4c53-8813-86f64a02c253","subject":"Error contract","status":"open","region":"eu","participants":["qa-e1f52a019971","qa-d541c6130644"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.769101399Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-6a4c4353-031a-4884-9762-7b5ec7394ea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a4c4353-031a-4884-9762-7b5ec7394ea3
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 34 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a4c4353-031a-4884-9762-7b5ec7394ea3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 9
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-6a4c4353-031a-4884-9762-7b5ec7394ea3","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-29f7990a-2dc6-48ed-a7e9-f72435862bc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29f7990a-2dc6-48ed-a7e9-f72435862bc3
Content-Type: application/json

--- request body ---
{"handle":"qa-d541c6130644","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-29f7990a-2dc6-48ed-a7e9-f72435862bc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_304b5306-11ab-4805-abf5-41775f8edc1f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-624fa7af-b1c6-4ca6-bcf8-e5c45455ed04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-624fa7af-b1c6-4ca6-bcf8-e5c45455ed04
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-624fa7af-b1c6-4ca6-bcf8-e5c45455ed04
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
correlation: qa-94f38e01-9c61-440a-aff7-d1c2f28fc785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f38e01-9c61-440a-aff7-d1c2f28fc785
Content-Type: application/json

--- request body ---
{"handle":"qa-d541c6130644","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94f38e01-9c61-440a-aff7-d1c2f28fc785
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94f38e01-9c61-440a-aff7-d1c2f28fc785"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c852334a-0d04-41a5-ba0b-299c54790a02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c852334a-0d04-41a5-ba0b-299c54790a02
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c852334a-0d04-41a5-ba0b-299c54790a02
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
correlation: qa-e86584cc-3c2e-44fd-b7e3-ce0d005a232f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e86584cc-3c2e-44fd-b7e3-ce0d005a232f
Content-Type: application/json

--- request body ---
{"handle":"qa-e1f52a019971","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e86584cc-3c2e-44fd-b7e3-ce0d005a232f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e86584cc-3c2e-44fd-b7e3-ce0d005a232f"}
```
