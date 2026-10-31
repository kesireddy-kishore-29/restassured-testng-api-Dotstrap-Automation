# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-ca1c01a3-517b-4c5f-99f0-6a3b24a995e6` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-b386d618-d14a-4dc4-836d-24e18e9b0814` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-6dd7447a-5922-452b-801d-5a1955c8cac4` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-63bc0ec5-9265-4094-a325-0b9238e2e713` |
| 5 | `POST /v1/credits/purchases` | 422 | 11 | `qa-69da9079-3095-4017-ada3-30943af85543` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-a00f6a78-4784-450e-be50-972fe81659ed` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-4c86fd52-3041-437d-bdf4-81536c4df1d5` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-7e51db50-8aa4-4804-902c-b54e5769d54a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0b75f5b7-6457-4f23-b3e9-7a89209adc64` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-bc53f5c3-c78a-4404-b5a7-691c299e3899` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ca1c01a3-517b-4c5f-99f0-6a3b24a995e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca1c01a3-517b-4c5f-99f0-6a3b24a995e6
Content-Type: application/json

--- request body ---
{"handle":"qa-ac162dc79548","displayName":"QA ac162dc79548","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca1c01a3-517b-4c5f-99f0-6a3b24a995e6
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
Location: /v1/accounts/qa-ac162dc79548
X-Served-Region: eu
Content-Length: 181

{"id":"acc_33d32ba2-7609-4723-8be5-9ba85dca0d49","handle":"qa-ac162dc79548","displayName":"QA ac162dc79548","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.831087124Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b386d618-d14a-4dc4-836d-24e18e9b0814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b386d618-d14a-4dc4-836d-24e18e9b0814
Content-Type: application/json

--- request body ---
{"handle":"qa-335a11726100","displayName":"QA 335a11726100","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b386d618-d14a-4dc4-836d-24e18e9b0814
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
Location: /v1/accounts/qa-335a11726100
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f87e6fb-c937-4bb4-8008-9e3a58d7c082","handle":"qa-335a11726100","displayName":"QA 335a11726100","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.851366344Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6dd7447a-5922-452b-801d-5a1955c8cac4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd7447a-5922-452b-801d-5a1955c8cac4
Content-Type: application/json

--- request body ---
{"handle":"qa-ac162dc79548","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dd7447a-5922-452b-801d-5a1955c8cac4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_33d32ba2-7609-4723-8be5-9ba85dca0d49"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-63bc0ec5-9265-4094-a325-0b9238e2e713

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63bc0ec5-9265-4094-a325-0b9238e2e713
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-335a11726100","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-63bc0ec5-9265-4094-a325-0b9238e2e713
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
Location: /v1/conversations/cnv_a53f154a-8921-45fe-bb5e-f21e14394f1e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a53f154a-8921-45fe-bb5e-f21e14394f1e","subject":"Error contract","status":"open","region":"eu","participants":["qa-ac162dc79548","qa-335a11726100"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.884356536Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-69da9079-3095-4017-ada3-30943af85543

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2445fb0744c7493285a8bd2761ae3ae7
X-Correlation-Id: qa-69da9079-3095-4017-ada3-30943af85543
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69da9079-3095-4017-ada3-30943af85543
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-69da9079-3095-4017-ada3-30943af85543","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a00f6a78-4784-450e-be50-972fe81659ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a00f6a78-4784-450e-be50-972fe81659ed
Content-Type: application/json

--- request body ---
{"handle":"qa-335a11726100","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a00f6a78-4784-450e-be50-972fe81659ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f87e6fb-c937-4bb4-8008-9e3a58d7c082"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c86fd52-3041-437d-bdf4-81536c4df1d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c86fd52-3041-437d-bdf4-81536c4df1d5
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c86fd52-3041-437d-bdf4-81536c4df1d5
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
correlation: qa-7e51db50-8aa4-4804-902c-b54e5769d54a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e51db50-8aa4-4804-902c-b54e5769d54a
Content-Type: application/json

--- request body ---
{"handle":"qa-335a11726100","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e51db50-8aa4-4804-902c-b54e5769d54a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e51db50-8aa4-4804-902c-b54e5769d54a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b75f5b7-6457-4f23-b3e9-7a89209adc64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b75f5b7-6457-4f23-b3e9-7a89209adc64
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b75f5b7-6457-4f23-b3e9-7a89209adc64
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
correlation: qa-bc53f5c3-c78a-4404-b5a7-691c299e3899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc53f5c3-c78a-4404-b5a7-691c299e3899
Content-Type: application/json

--- request body ---
{"handle":"qa-ac162dc79548","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc53f5c3-c78a-4404-b5a7-691c299e3899
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc53f5c3-c78a-4404-b5a7-691c299e3899"}
```
