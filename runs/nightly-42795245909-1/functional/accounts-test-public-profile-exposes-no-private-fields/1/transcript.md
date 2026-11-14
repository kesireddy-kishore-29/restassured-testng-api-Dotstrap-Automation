# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-8307a88d-350a-4b10-a091-33c6207c9199` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-4e571919-2f7e-47e4-95e0-4c6e9998447f` |
| 3 | `POST /v1/auth/token` | 200 | 7 | `qa-014c8edf-777d-4d7b-b14f-c34b9773d4e9` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-ee6215d1-93d6-472e-ae43-95b6b607422f` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-e435f827-eae0-4d2a-bc74-8b65656ead30` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-67cb1028-8551-4f5b-9293-356c9ec29ee8` |
| 7 | `POST /v1/auth/token` | 200 | 8 | `qa-5313165e-d1aa-4bf6-8b22-85a03d1f6d4d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-41fa0b57-68b9-447e-80d0-23fb3609f584` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-26621865-fdd6-45f3-915b-e2b261a40748` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ec4e36eb-c662-44df-9e48-552bfe1620af` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-2c175721-fbae-4ca4-8702-4df2c26bc734` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8307a88d-350a-4b10-a091-33c6207c9199

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8307a88d-350a-4b10-a091-33c6207c9199
Content-Type: application/json

--- request body ---
{"handle":"qa-604cb4ee1e5d","displayName":"QA 604cb4ee1e5d","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-8307a88d-350a-4b10-a091-33c6207c9199
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-604cb4ee1e5d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8461d7d7-a51f-4a84-a2f1-dd43ce5f8ecc","handle":"qa-604cb4ee1e5d","displayName":"QA 604cb4ee1e5d","region":"eu","role":"user","createdAt":"2026-11-10T09:59:38.159515249Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4e571919-2f7e-47e4-95e0-4c6e9998447f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e571919-2f7e-47e4-95e0-4c6e9998447f
Content-Type: application/json

--- request body ---
{"handle":"qa-a0c39a51297e","displayName":"QA a0c39a51297e","password":"****","region":"us"}

--- response: 201 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e571919-2f7e-47e4-95e0-4c6e9998447f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-a0c39a51297e
X-Served-Region: us
Content-Length: 181

{"id":"acc_67e4311d-7079-41de-8889-9e9422e368ae","handle":"qa-a0c39a51297e","displayName":"QA a0c39a51297e","region":"us","role":"user","createdAt":"2026-11-10T09:59:38.180520627Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-014c8edf-777d-4d7b-b14f-c34b9773d4e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-014c8edf-777d-4d7b-b14f-c34b9773d4e9
Content-Type: application/json

--- request body ---
{"handle":"qa-604cb4ee1e5d","password":"****"}

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-014c8edf-777d-4d7b-b14f-c34b9773d4e9
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8461d7d7-a51f-4a84-a2f1-dd43ce5f8ecc"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-a0c39a51297e
correlation: qa-ee6215d1-93d6-472e-ae43-95b6b607422f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee6215d1-93d6-472e-ae43-95b6b607422f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee6215d1-93d6-472e-ae43-95b6b607422f
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
Content-Length: 74

{"handle":"qa-a0c39a51297e","displayName":"QA a0c39a51297e","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-a0c39a51297e
correlation: qa-e435f827-eae0-4d2a-bc74-8b65656ead30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e435f827-eae0-4d2a-bc74-8b65656ead30
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-e435f827-eae0-4d2a-bc74-8b65656ead30
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
Content-Length: 74

{"handle":"qa-a0c39a51297e","displayName":"QA a0c39a51297e","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-a0c39a51297e
correlation: qa-67cb1028-8551-4f5b-9293-356c9ec29ee8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67cb1028-8551-4f5b-9293-356c9ec29ee8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-67cb1028-8551-4f5b-9293-356c9ec29ee8
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
Content-Length: 74

{"handle":"qa-a0c39a51297e","displayName":"QA a0c39a51297e","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-5313165e-d1aa-4bf6-8b22-85a03d1f6d4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5313165e-d1aa-4bf6-8b22-85a03d1f6d4d
Content-Type: application/json

--- request body ---
{"handle":"qa-a0c39a51297e","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5313165e-d1aa-4bf6-8b22-85a03d1f6d4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_67e4311d-7079-41de-8889-9e9422e368ae"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41fa0b57-68b9-447e-80d0-23fb3609f584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41fa0b57-68b9-447e-80d0-23fb3609f584
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41fa0b57-68b9-447e-80d0-23fb3609f584
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-26621865-fdd6-45f3-915b-e2b261a40748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26621865-fdd6-45f3-915b-e2b261a40748
Content-Type: application/json

--- request body ---
{"handle":"qa-a0c39a51297e","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26621865-fdd6-45f3-915b-e2b261a40748
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-26621865-fdd6-45f3-915b-e2b261a40748"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec4e36eb-c662-44df-9e48-552bfe1620af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec4e36eb-c662-44df-9e48-552bfe1620af
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec4e36eb-c662-44df-9e48-552bfe1620af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-2c175721-fbae-4ca4-8702-4df2c26bc734

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c175721-fbae-4ca4-8702-4df2c26bc734
Content-Type: application/json

--- request body ---
{"handle":"qa-604cb4ee1e5d","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c175721-fbae-4ca4-8702-4df2c26bc734
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c175721-fbae-4ca4-8702-4df2c26bc734"}
```
