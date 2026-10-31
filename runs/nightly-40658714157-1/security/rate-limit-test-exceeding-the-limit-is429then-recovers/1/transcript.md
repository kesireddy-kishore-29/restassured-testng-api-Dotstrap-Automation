# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 82 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 453 | `qa-8a593af7-1742-42f0-9dda-18fc89c4bbd9` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-d81b1c75-3636-4217-bf57-783f0750503c` |
| 3 | `GET /v1/accounts/me` | 200 | 63 | `qa-8730d346-8d75-4b81-b848-e146a0e9bce3` |
| 4 | `GET /v1/accounts/me` | 200 | 19 | `qa-07a9bd3f-d4ff-44bb-b1b0-b7eae433e2f3` |
| 5 | `GET /v1/accounts/me` | 200 | 23 | `qa-84f964ce-7cda-4817-9dee-af34907ed166` |
| 6 | `GET /v1/accounts/me` | 200 | 21 | `qa-e3b82add-80e6-4c6e-8217-05dc56bea976` |
| 7 | `GET /v1/accounts/me` | 200 | 23 | `qa-205e3099-5e7e-442c-ab7c-2819640b335d` |
| 8 | `GET /v1/accounts/me` | 200 | 9 | `qa-4f1deba3-5678-4fbe-88f7-86343fe90c98` |
| 9 | `GET /v1/accounts/me` | 200 | 13 | `qa-e884c383-c9f2-486f-9453-5ffc8bf25736` |
| 10 | `GET /v1/accounts/me` | 200 | 17 | `qa-7192047a-639d-4103-8c50-dc09f523bff7` |
| 11 | `GET /v1/accounts/me` | 200 | 15 | `qa-3ed8e86e-0f5e-4b8b-82c2-ec21c69b1536` |
| 12 | `GET /v1/accounts/me` | 200 | 9 | `qa-97440d4e-f160-4725-8384-97bc90fc10a5` |
| 13 | `GET /v1/accounts/me` | 200 | 17 | `qa-a7691c8e-cc7a-48af-8d94-bbce560d1397` |
| 14 | `GET /v1/accounts/me` | 200 | 13 | `qa-fb5997dc-c4b3-4b15-ae0f-8d98f0829db7` |
| 15 | `GET /v1/accounts/me` | 200 | 9 | `qa-5352dcf5-341b-420f-b1e1-6c4892c87225` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-20016978-a3ca-4c9f-adb1-4398ef799201` |
| 17 | `GET /v1/accounts/me` | 200 | 11 | `qa-7d6eabbb-8a3c-4b51-beeb-489d6edfd0db` |
| 18 | `GET /v1/accounts/me` | 200 | 14 | `qa-4566d4a3-aaa2-4634-b1b7-cd0b01ac82e1` |
| 19 | `GET /v1/accounts/me` | 200 | 7 | `qa-82b1dfde-3f70-4964-9982-ea7668c1faec` |
| 20 | `GET /v1/accounts/me` | 200 | 9 | `qa-6ba8786d-2019-44d4-a6eb-7f74c048e6c7` |
| 21 | `GET /v1/accounts/me` | 200 | 12 | `qa-f91176f0-cb63-48a7-aa7f-a675d4c888fe` |
| 22 | `GET /v1/accounts/me` | 200 | 9 | `qa-89389f91-7373-4202-af42-d406e1781a29` |
| 23 | `GET /v1/accounts/me` | 200 | 9 | `qa-43fccd01-c18b-4f63-834b-dbf8094fb8b9` |
| 24 | `GET /v1/accounts/me` | 200 | 10 | `qa-bca58d96-fbce-40d2-9e46-5eec534ad1dc` |
| 25 | `GET /v1/accounts/me` | 200 | 13 | `qa-ae78464e-5d6a-4654-b8e0-12277dd32218` |
| 26 | `GET /v1/accounts/me` | 200 | 11 | `qa-8d7e2b1f-a364-4809-8b0f-2a20fe23f354` |
| 27 | `GET /v1/accounts/me` | 200 | 14 | `qa-33a0fd18-2cae-454d-8fd0-cac64ea28046` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-8a979737-17a3-4490-b178-3c3c3b8c9f78` |
| 29 | `GET /v1/accounts/me` | 200 | 12 | `qa-22e2f647-8692-454b-908c-8ca7a99ea9e1` |
| 30 | `GET /v1/accounts/me` | 200 | 7 | `qa-551d9a59-a77f-496f-ad2b-93f448b0de90` |
| 31 | `GET /v1/accounts/me` | 200 | 9 | `qa-0f623a70-ce29-4a1b-8327-351eaa4ce92d` |
| 32 | `GET /v1/accounts/me` | 200 | 9 | `qa-20b36832-11eb-4198-a67e-2c0a594c790a` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-a29da873-0bfc-452b-9465-4e25482c0ae5` |
| 34 | `GET /v1/accounts/me` | 200 | 7 | `qa-1699eec7-2ef0-4f90-8e92-3228ea7ffa69` |
| 35 | `GET /v1/accounts/me` | 200 | 11 | `qa-9e1a954d-6565-451c-bb8e-830d9437e445` |
| 36 | `GET /v1/accounts/me` | 200 | 7 | `qa-423b5e8a-7197-49dd-8a60-785292a0e0ea` |
| 37 | `GET /v1/accounts/me` | 200 | 10 | `qa-6732c1f3-e4ff-4eeb-ab94-4c2d674784b9` |
| 38 | `GET /v1/accounts/me` | 200 | 7 | `qa-54fb17c0-1c9d-4843-a333-0eb4717075e4` |
| 39 | `GET /v1/accounts/me` | 200 | 9 | `qa-7e66d1a9-562d-4a69-85b1-2b2e3a6188bd` |
| 40 | `GET /v1/accounts/me` | 200 | 11 | `qa-1b362951-c269-419f-9f66-70c948a87964` |
| 41 | `GET /v1/accounts/me` | 200 | 12 | `qa-213fca1f-e0ab-4b6f-9c8a-a300878be7af` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-980e4c9d-8014-46a6-8875-803667e099d2` |
| 43 | `GET /v1/accounts/me` | 200 | 12 | `qa-92dd1540-8087-43eb-9d30-27e5f18172c4` |
| 44 | `GET /v1/accounts/me` | 200 | 13 | `qa-aa4bb60c-51f9-41bf-850b-ca8d71fb90af` |
| 45 | `GET /v1/accounts/me` | 200 | 11 | `qa-5471d929-2c3d-4216-8c1c-59c4e085d31a` |
| 46 | `GET /v1/accounts/me` | 200 | 10 | `qa-ee74cedf-dc60-4c9a-a51c-904226afcb44` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-2913d492-b0ae-4a16-99cd-40f9686bb79e` |
| 48 | `GET /v1/accounts/me` | 200 | 14 | `qa-10f3178a-dd41-4677-9379-d444c5f78205` |
| 49 | `GET /v1/accounts/me` | 200 | 12 | `qa-db2a516e-41fb-499e-a976-e36f880b171e` |
| 50 | `GET /v1/accounts/me` | 200 | 11 | `qa-1b03af1e-1b32-45c6-b606-de3e383b2c77` |
| 51 | `GET /v1/accounts/me` | 200 | 18 | `qa-b5d99693-36bb-4193-94de-5e91ff0ee244` |
| 52 | `GET /v1/accounts/me` | 200 | 7 | `qa-7118f9b0-0a42-4498-bb0e-b93962a34956` |
| 53 | `GET /v1/accounts/me` | 200 | 5 | `qa-d2351f94-988e-48da-9e9c-f1df05d69a53` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-6315d2c0-ae51-45dd-9a1c-de25dc949ab2` |
| 55 | `GET /v1/accounts/me` | 200 | 5 | `qa-b08580aa-66e6-40cc-8e36-e715e700fb2e` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-e8143755-7c20-4c79-bf12-a51862a1e1d6` |
| 57 | `GET /v1/accounts/me` | 200 | 5 | `qa-ee868859-9499-4371-9bd0-64d3fb6aab99` |
| 58 | `GET /v1/accounts/me` | 200 | 5 | `qa-9d764d53-3505-4328-b812-aae5bd96fe73` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-83c69508-6d92-45c6-be81-97da9058c7a3` |
| 60 | `GET /v1/accounts/me` | 200 | 8 | `qa-1ecd581b-65cc-4c45-a653-d14fb0a98690` |
| 61 | `GET /v1/accounts/me` | 200 | 11 | `qa-88fe887f-a9c4-43fd-9c39-1b9013694c47` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-d96ecb1a-fa68-4a7e-8334-a596e2637cd9` |
| 63 | `GET /v1/accounts/me` | 429 | 6 | `qa-1180701e-a08b-481a-822a-a0e5bf0196e3` |
| 64 | `GET /v1/accounts/me` | 429 | 7 | `qa-e48aa57e-4ecc-45a7-a01a-6b686ab0058e` |
| 65 | `GET /v1/accounts/me` | 429 | 8 | `qa-cb60aecc-0760-438e-9068-6f8f2fc1eaea` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-f2db5836-5fe1-4573-905c-ea26fa4840af` |
| 67 | `GET /v1/accounts/me` | 429 | 6 | `qa-6adfa864-70c5-4ad4-8793-7677ecb67373` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-997ac329-207d-4e0d-96b3-9666f8bac894` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-583e0601-a25d-4d71-a91f-45371d16a3e7` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-52d4bf5e-ae66-4aee-afc2-a0c4abc916ee` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-608e10f7-3ea1-4e50-a417-5367001716fd` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-10a742e3-4a58-4d78-b95d-be96f0e1d7c1` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-c7f9f30c-e2c6-4df6-ae43-50ca35c5a23d` |
| 74 | `GET /v1/accounts/me` | 429 | 5 | `qa-97b2de3b-88df-42b7-a5d3-2554e2dae675` |
| 75 | `GET /v1/accounts/me` | 429 | 7 | `qa-dc68530a-bba5-4c08-96c4-fe30c756aec0` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-f8257e82-3cc5-4f84-9b63-cfeb216e9149` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-39677436-7e55-48f6-871c-ae27bb502529` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-256a72ed-59bd-4b1f-b286-04e5b80d510a` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-f875d2a1-75ff-4036-86b3-a96a6474ccc8` |
| 80 | `GET /v1/accounts/me` | 200 | 3 | `qa-8328a060-f3e2-483c-b502-dd0d7fb20933` |
| 81 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-273a24d5-dace-4203-a620-05ee52e1c481` |
| 82 | `POST /v1/auth/token` | 401 | 3 | `qa-dd0c393d-1794-4d76-96c2-9bf182231af0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8a593af7-1742-42f0-9dda-18fc89c4bbd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a593af7-1742-42f0-9dda-18fc89c4bbd9
Content-Type: application/json

--- request body ---
{"handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","password":"****","region":"eu"}

--- response: 201 in 453 ms ---
Date: Wed, 28 Oct 2026 08:42:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a593af7-1742-42f0-9dda-18fc89c4bbd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-afef6d01abac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d81b1c75-3636-4217-bf57-783f0750503c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d81b1c75-3636-4217-bf57-783f0750503c
Content-Type: application/json

--- request body ---
{"handle":"qa-afef6d01abac","password":"****"}

--- response: 200 in 49 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d81b1c75-3636-4217-bf57-783f0750503c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8730d346-8d75-4b81-b848-e146a0e9bce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8730d346-8d75-4b81-b848-e146a0e9bce3
Content-Type: application/json

--- response: 200 in 63 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8730d346-8d75-4b81-b848-e146a0e9bce3
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
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-07a9bd3f-d4ff-44bb-b1b0-b7eae433e2f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07a9bd3f-d4ff-44bb-b1b0-b7eae433e2f3
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-07a9bd3f-d4ff-44bb-b1b0-b7eae433e2f3
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
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-84f964ce-7cda-4817-9dee-af34907ed166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84f964ce-7cda-4817-9dee-af34907ed166
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-84f964ce-7cda-4817-9dee-af34907ed166
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
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3b82add-80e6-4c6e-8217-05dc56bea976

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b82add-80e6-4c6e-8217-05dc56bea976
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3b82add-80e6-4c6e-8217-05dc56bea976
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
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-205e3099-5e7e-442c-ab7c-2819640b335d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-205e3099-5e7e-442c-ab7c-2819640b335d
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-205e3099-5e7e-442c-ab7c-2819640b335d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-4f1deba3-5678-4fbe-88f7-86343fe90c98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f1deba3-5678-4fbe-88f7-86343fe90c98
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f1deba3-5678-4fbe-88f7-86343fe90c98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-e884c383-c9f2-486f-9453-5ffc8bf25736

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e884c383-c9f2-486f-9453-5ffc8bf25736
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e884c383-c9f2-486f-9453-5ffc8bf25736
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-7192047a-639d-4103-8c50-dc09f523bff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7192047a-639d-4103-8c50-dc09f523bff7
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7192047a-639d-4103-8c50-dc09f523bff7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ed8e86e-0f5e-4b8b-82c2-ec21c69b1536

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ed8e86e-0f5e-4b8b-82c2-ec21c69b1536
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ed8e86e-0f5e-4b8b-82c2-ec21c69b1536
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-97440d4e-f160-4725-8384-97bc90fc10a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97440d4e-f160-4725-8384-97bc90fc10a5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-97440d4e-f160-4725-8384-97bc90fc10a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7691c8e-cc7a-48af-8d94-bbce560d1397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7691c8e-cc7a-48af-8d94-bbce560d1397
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7691c8e-cc7a-48af-8d94-bbce560d1397
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb5997dc-c4b3-4b15-ae0f-8d98f0829db7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb5997dc-c4b3-4b15-ae0f-8d98f0829db7
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb5997dc-c4b3-4b15-ae0f-8d98f0829db7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-5352dcf5-341b-420f-b1e1-6c4892c87225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5352dcf5-341b-420f-b1e1-6c4892c87225
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5352dcf5-341b-420f-b1e1-6c4892c87225
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-20016978-a3ca-4c9f-adb1-4398ef799201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20016978-a3ca-4c9f-adb1-4398ef799201
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-20016978-a3ca-4c9f-adb1-4398ef799201
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d6eabbb-8a3c-4b51-beeb-489d6edfd0db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d6eabbb-8a3c-4b51-beeb-489d6edfd0db
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d6eabbb-8a3c-4b51-beeb-489d6edfd0db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-4566d4a3-aaa2-4634-b1b7-cd0b01ac82e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4566d4a3-aaa2-4634-b1b7-cd0b01ac82e1
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4566d4a3-aaa2-4634-b1b7-cd0b01ac82e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-82b1dfde-3f70-4964-9982-ea7668c1faec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82b1dfde-3f70-4964-9982-ea7668c1faec
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-82b1dfde-3f70-4964-9982-ea7668c1faec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ba8786d-2019-44d4-a6eb-7f74c048e6c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ba8786d-2019-44d4-a6eb-7f74c048e6c7
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ba8786d-2019-44d4-a6eb-7f74c048e6c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-f91176f0-cb63-48a7-aa7f-a675d4c888fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f91176f0-cb63-48a7-aa7f-a675d4c888fe
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f91176f0-cb63-48a7-aa7f-a675d4c888fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-89389f91-7373-4202-af42-d406e1781a29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89389f91-7373-4202-af42-d406e1781a29
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-89389f91-7373-4202-af42-d406e1781a29
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-43fccd01-c18b-4f63-834b-dbf8094fb8b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43fccd01-c18b-4f63-834b-dbf8094fb8b9
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-43fccd01-c18b-4f63-834b-dbf8094fb8b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-bca58d96-fbce-40d2-9e46-5eec534ad1dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca58d96-fbce-40d2-9e46-5eec534ad1dc
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bca58d96-fbce-40d2-9e46-5eec534ad1dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae78464e-5d6a-4654-b8e0-12277dd32218

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae78464e-5d6a-4654-b8e0-12277dd32218
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae78464e-5d6a-4654-b8e0-12277dd32218
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d7e2b1f-a364-4809-8b0f-2a20fe23f354

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d7e2b1f-a364-4809-8b0f-2a20fe23f354
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d7e2b1f-a364-4809-8b0f-2a20fe23f354
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-33a0fd18-2cae-454d-8fd0-cac64ea28046

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a0fd18-2cae-454d-8fd0-cac64ea28046
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-33a0fd18-2cae-454d-8fd0-cac64ea28046
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a979737-17a3-4490-b178-3c3c3b8c9f78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a979737-17a3-4490-b178-3c3c3b8c9f78
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a979737-17a3-4490-b178-3c3c3b8c9f78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-22e2f647-8692-454b-908c-8ca7a99ea9e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22e2f647-8692-454b-908c-8ca7a99ea9e1
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-22e2f647-8692-454b-908c-8ca7a99ea9e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-551d9a59-a77f-496f-ad2b-93f448b0de90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-551d9a59-a77f-496f-ad2b-93f448b0de90
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-551d9a59-a77f-496f-ad2b-93f448b0de90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f623a70-ce29-4a1b-8327-351eaa4ce92d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f623a70-ce29-4a1b-8327-351eaa4ce92d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f623a70-ce29-4a1b-8327-351eaa4ce92d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-20b36832-11eb-4198-a67e-2c0a594c790a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20b36832-11eb-4198-a67e-2c0a594c790a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-20b36832-11eb-4198-a67e-2c0a594c790a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-a29da873-0bfc-452b-9465-4e25482c0ae5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a29da873-0bfc-452b-9465-4e25482c0ae5
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a29da873-0bfc-452b-9465-4e25482c0ae5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-1699eec7-2ef0-4f90-8e92-3228ea7ffa69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1699eec7-2ef0-4f90-8e92-3228ea7ffa69
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1699eec7-2ef0-4f90-8e92-3228ea7ffa69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e1a954d-6565-451c-bb8e-830d9437e445

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e1a954d-6565-451c-bb8e-830d9437e445
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e1a954d-6565-451c-bb8e-830d9437e445
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-423b5e8a-7197-49dd-8a60-785292a0e0ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-423b5e8a-7197-49dd-8a60-785292a0e0ea
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-423b5e8a-7197-49dd-8a60-785292a0e0ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-6732c1f3-e4ff-4eeb-ab94-4c2d674784b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6732c1f3-e4ff-4eeb-ab94-4c2d674784b9
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6732c1f3-e4ff-4eeb-ab94-4c2d674784b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-54fb17c0-1c9d-4843-a333-0eb4717075e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54fb17c0-1c9d-4843-a333-0eb4717075e4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-54fb17c0-1c9d-4843-a333-0eb4717075e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e66d1a9-562d-4a69-85b1-2b2e3a6188bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e66d1a9-562d-4a69-85b1-2b2e3a6188bd
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e66d1a9-562d-4a69-85b1-2b2e3a6188bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b362951-c269-419f-9f66-70c948a87964

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b362951-c269-419f-9f66-70c948a87964
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b362951-c269-419f-9f66-70c948a87964
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-213fca1f-e0ab-4b6f-9c8a-a300878be7af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-213fca1f-e0ab-4b6f-9c8a-a300878be7af
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-213fca1f-e0ab-4b6f-9c8a-a300878be7af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-980e4c9d-8014-46a6-8875-803667e099d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-980e4c9d-8014-46a6-8875-803667e099d2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-980e4c9d-8014-46a6-8875-803667e099d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-92dd1540-8087-43eb-9d30-27e5f18172c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92dd1540-8087-43eb-9d30-27e5f18172c4
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-92dd1540-8087-43eb-9d30-27e5f18172c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa4bb60c-51f9-41bf-850b-ca8d71fb90af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa4bb60c-51f9-41bf-850b-ca8d71fb90af
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa4bb60c-51f9-41bf-850b-ca8d71fb90af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-5471d929-2c3d-4216-8c1c-59c4e085d31a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5471d929-2c3d-4216-8c1c-59c4e085d31a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5471d929-2c3d-4216-8c1c-59c4e085d31a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee74cedf-dc60-4c9a-a51c-904226afcb44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee74cedf-dc60-4c9a-a51c-904226afcb44
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee74cedf-dc60-4c9a-a51c-904226afcb44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-2913d492-b0ae-4a16-99cd-40f9686bb79e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2913d492-b0ae-4a16-99cd-40f9686bb79e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2913d492-b0ae-4a16-99cd-40f9686bb79e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-10f3178a-dd41-4677-9379-d444c5f78205

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10f3178a-dd41-4677-9379-d444c5f78205
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-10f3178a-dd41-4677-9379-d444c5f78205
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-db2a516e-41fb-499e-a976-e36f880b171e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db2a516e-41fb-499e-a976-e36f880b171e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-db2a516e-41fb-499e-a976-e36f880b171e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b03af1e-1b32-45c6-b606-de3e383b2c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b03af1e-1b32-45c6-b606-de3e383b2c77
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b03af1e-1b32-45c6-b606-de3e383b2c77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5d99693-36bb-4193-94de-5e91ff0ee244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5d99693-36bb-4193-94de-5e91ff0ee244
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5d99693-36bb-4193-94de-5e91ff0ee244
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-7118f9b0-0a42-4498-bb0e-b93962a34956

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7118f9b0-0a42-4498-bb0e-b93962a34956
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7118f9b0-0a42-4498-bb0e-b93962a34956
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2351f94-988e-48da-9e9c-f1df05d69a53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2351f94-988e-48da-9e9c-f1df05d69a53
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2351f94-988e-48da-9e9c-f1df05d69a53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-6315d2c0-ae51-45dd-9a1c-de25dc949ab2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6315d2c0-ae51-45dd-9a1c-de25dc949ab2
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6315d2c0-ae51-45dd-9a1c-de25dc949ab2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-b08580aa-66e6-40cc-8e36-e715e700fb2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b08580aa-66e6-40cc-8e36-e715e700fb2e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b08580aa-66e6-40cc-8e36-e715e700fb2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8143755-7c20-4c79-bf12-a51862a1e1d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8143755-7c20-4c79-bf12-a51862a1e1d6
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8143755-7c20-4c79-bf12-a51862a1e1d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee868859-9499-4371-9bd0-64d3fb6aab99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee868859-9499-4371-9bd0-64d3fb6aab99
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee868859-9499-4371-9bd0-64d3fb6aab99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d764d53-3505-4328-b812-aae5bd96fe73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d764d53-3505-4328-b812-aae5bd96fe73
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d764d53-3505-4328-b812-aae5bd96fe73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-83c69508-6d92-45c6-be81-97da9058c7a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83c69508-6d92-45c6-be81-97da9058c7a3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-83c69508-6d92-45c6-be81-97da9058c7a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ecd581b-65cc-4c45-a653-d14fb0a98690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ecd581b-65cc-4c45-a653-d14fb0a98690
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ecd581b-65cc-4c45-a653-d14fb0a98690
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-88fe887f-a9c4-43fd-9c39-1b9013694c47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88fe887f-a9c4-43fd-9c39-1b9013694c47
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-88fe887f-a9c4-43fd-9c39-1b9013694c47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-d96ecb1a-fa68-4a7e-8334-a596e2637cd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d96ecb1a-fa68-4a7e-8334-a596e2637cd9
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d96ecb1a-fa68-4a7e-8334-a596e2637cd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-1180701e-a08b-481a-822a-a0e5bf0196e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1180701e-a08b-481a-822a-a0e5bf0196e3
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1180701e-a08b-481a-822a-a0e5bf0196e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1180701e-a08b-481a-822a-a0e5bf0196e3"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-e48aa57e-4ecc-45a7-a01a-6b686ab0058e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e48aa57e-4ecc-45a7-a01a-6b686ab0058e
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e48aa57e-4ecc-45a7-a01a-6b686ab0058e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e48aa57e-4ecc-45a7-a01a-6b686ab0058e"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb60aecc-0760-438e-9068-6f8f2fc1eaea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb60aecc-0760-438e-9068-6f8f2fc1eaea
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb60aecc-0760-438e-9068-6f8f2fc1eaea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cb60aecc-0760-438e-9068-6f8f2fc1eaea"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-f2db5836-5fe1-4573-905c-ea26fa4840af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2db5836-5fe1-4573-905c-ea26fa4840af
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2db5836-5fe1-4573-905c-ea26fa4840af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f2db5836-5fe1-4573-905c-ea26fa4840af"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-6adfa864-70c5-4ad4-8793-7677ecb67373

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6adfa864-70c5-4ad4-8793-7677ecb67373
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 28 Oct 2026 08:43:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6adfa864-70c5-4ad4-8793-7677ecb67373
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6adfa864-70c5-4ad4-8793-7677ecb67373"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-997ac329-207d-4e0d-96b3-9666f8bac894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-997ac329-207d-4e0d-96b3-9666f8bac894
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-997ac329-207d-4e0d-96b3-9666f8bac894
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-997ac329-207d-4e0d-96b3-9666f8bac894"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-583e0601-a25d-4d71-a91f-45371d16a3e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-583e0601-a25d-4d71-a91f-45371d16a3e7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-583e0601-a25d-4d71-a91f-45371d16a3e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-583e0601-a25d-4d71-a91f-45371d16a3e7"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-52d4bf5e-ae66-4aee-afc2-a0c4abc916ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52d4bf5e-ae66-4aee-afc2-a0c4abc916ee
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52d4bf5e-ae66-4aee-afc2-a0c4abc916ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-52d4bf5e-ae66-4aee-afc2-a0c4abc916ee"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-608e10f7-3ea1-4e50-a417-5367001716fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-608e10f7-3ea1-4e50-a417-5367001716fd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-608e10f7-3ea1-4e50-a417-5367001716fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-608e10f7-3ea1-4e50-a417-5367001716fd"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-10a742e3-4a58-4d78-b95d-be96f0e1d7c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10a742e3-4a58-4d78-b95d-be96f0e1d7c1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10a742e3-4a58-4d78-b95d-be96f0e1d7c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-10a742e3-4a58-4d78-b95d-be96f0e1d7c1"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-c7f9f30c-e2c6-4df6-ae43-50ca35c5a23d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7f9f30c-e2c6-4df6-ae43-50ca35c5a23d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7f9f30c-e2c6-4df6-ae43-50ca35c5a23d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c7f9f30c-e2c6-4df6-ae43-50ca35c5a23d"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-97b2de3b-88df-42b7-a5d3-2554e2dae675

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97b2de3b-88df-42b7-a5d3-2554e2dae675
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97b2de3b-88df-42b7-a5d3-2554e2dae675
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-97b2de3b-88df-42b7-a5d3-2554e2dae675"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc68530a-bba5-4c08-96c4-fe30c756aec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc68530a-bba5-4c08-96c4-fe30c756aec0
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 28 Oct 2026 08:43:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc68530a-bba5-4c08-96c4-fe30c756aec0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dc68530a-bba5-4c08-96c4-fe30c756aec0"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8257e82-3cc5-4f84-9b63-cfeb216e9149

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8257e82-3cc5-4f84-9b63-cfeb216e9149
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8257e82-3cc5-4f84-9b63-cfeb216e9149
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f8257e82-3cc5-4f84-9b63-cfeb216e9149"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-39677436-7e55-48f6-871c-ae27bb502529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39677436-7e55-48f6-871c-ae27bb502529
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39677436-7e55-48f6-871c-ae27bb502529
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-39677436-7e55-48f6-871c-ae27bb502529"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-256a72ed-59bd-4b1f-b286-04e5b80d510a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-256a72ed-59bd-4b1f-b286-04e5b80d510a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-256a72ed-59bd-4b1f-b286-04e5b80d510a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-256a72ed-59bd-4b1f-b286-04e5b80d510a"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-f875d2a1-75ff-4036-86b3-a96a6474ccc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f875d2a1-75ff-4036-86b3-a96a6474ccc8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f875d2a1-75ff-4036-86b3-a96a6474ccc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f875d2a1-75ff-4036-86b3-a96a6474ccc8"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-8328a060-f3e2-483c-b502-dd0d7fb20933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8328a060-f3e2-483c-b502-dd0d7fb20933
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 28 Oct 2026 08:43:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-8328a060-f3e2-483c-b502-dd0d7fb20933
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
Content-Length: 181

{"id":"acc_6b7aa909-db19-42e0-a42a-2e934a74b6ef","handle":"qa-afef6d01abac","displayName":"QA afef6d01abac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.813147233Z"}
```

## 81. DELETE /v1/accounts/me

```text
#81 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-273a24d5-dace-4203-a620-05ee52e1c481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-273a24d5-dace-4203-a620-05ee52e1c481
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 28 Oct 2026 08:43:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-273a24d5-dace-4203-a620-05ee52e1c481
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

## 82. POST /v1/auth/token

```text
#82 POST http://localhost:7070/v1/auth/token
correlation: qa-dd0c393d-1794-4d76-96c2-9bf182231af0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd0c393d-1794-4d76-96c2-9bf182231af0
Content-Type: application/json

--- request body ---
{"handle":"qa-afef6d01abac","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 28 Oct 2026 08:43:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd0c393d-1794-4d76-96c2-9bf182231af0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dd0c393d-1794-4d76-96c2-9bf182231af0"}
```
